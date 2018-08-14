package cn.ericmoon.datastruct.UnionFind;

/**
 * @ProjectName: UnionFind
 * @CoderName: Eric Wong
 * @Date: 2018/8/14
 * @Desc: 基于重量对慢 Union 快 Find 的 Union-Find 的改进方法。
 */
public class FFBaseSF extends SlowFast{

    private int[] key = getKey();

    public FFBaseSF(int size) {
        super(size);
    }


    /**
      * @Description
      * 计算组内重量。
      * @parameters  [elem]
      * @return  int
      */
    public int getWeight(int elem){
        int num = 0;
        for (int i = 0; i < key.length; i++) {
            if(key[i] == key[elem]){
                num++;
            }
        }
        return num;
    }

    /**
      * @Description
      * 在Union前对比两组元素的重量,修改重量轻的组优化Union。
      * @parameters  [elem1, elem2]
      * @return  void
      */
    @Override
    public void sfUnion(int elem1, int elem2) {

        int w1 = getWeight(elem1);
        int w2 = getWeight(elem2);

        int key1 = sfFind(elem1);
        int key2 = sfFind(elem2);
        if(key1!=key2){
            if(w1>=w2){
                for (int i = 0; i < key.length; i++) {
                    if(key[i]==key2){
                        key[i] = key1;
                    }
                }
            }else {
                for (int i = 0; i < key.length; i++) {
                    if(key[i]==key1){
                        key[i] = key2;
                    }
                }
            }
        }
    }
}
