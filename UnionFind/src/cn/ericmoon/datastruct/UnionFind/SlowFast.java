package cn.ericmoon.datastruct.UnionFind;

/**
 * @ProjectName: UnionFind
 * @CoderName: Eric Wong
 * @Date: 2018/8/14
 * @Desc: 慢 Union 快 Find 的 Union-Find 实现。
 */
public class SlowFast {

    private int[] key;

    public int[] getKey() {
        return key;
    }

    /**
      * @Description
      * 慢 Union 快 Find 的 Union-Find 的构造函数初始化。
      * @parameters  [size]
      * @return  int[]
      */
    public SlowFast(int size) {
        key = new int[size];
        for (int i = 0; i < size; i++) {
            key[i] = i;
        }
    }


    /**
      * @Description
      * 慢 Union 快 Find 的 Union-Find 的Find方法,组数对应key值。
      * @parameters  [elem]
      * @return  int
      */
    public int sfFind(int elem){
        return key[elem];
    }


    /**
      * @Description
      * 慢 Union 快 Find 的 Union-Find 的Union方法。
      * 每次Union都需要遍历并数组并更改所有的对应元素key值所以慢。
      * @parameters  [elem1, elem2]
      * @return  void
      */
    public void sfUnion(int elem1,int elem2){
        int key1 = sfFind(elem1);
        int key2 = sfFind(elem2);
        if(key1!=key2){
            for (int i = 0; i < key.length; i++) {
                if(key[i]==key1){
                    key[i] = key2;
                }
            }
        }
    }

    /**
     * @Description
     * 辅助方法，不计入性能。
     * 分组输出方法。
     * @parameters  []
     * @return  void
     */
    public void SFPrint(){
        for (int i = 0; i < key.length; i++) {
            System.out.print("第"+i+"组:");
            for (int j = 0; j < key.length; j++) {
                if(key[j]==i){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

}
