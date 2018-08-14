package cn.ericmoon.datastruct.UnionFind;

/**
 * @ProjectName: UnionFind
 * @CoderName: Eric Wong
 * @Date: 2018/8/14
 * @Desc: 基于高度对快 Union 慢 Find 的 Union-Find 的改进方法。
 */
public class FFBaseFS extends FastSlow{
    private int[] key = getKey();

    public FFBaseFS(int size) {
        super(size);
    }

/**
 * @Description
 * 计算根节点的高度。
 * @parameters  [elem]
 * @return  int
 * 高度为零则表示该节点为根节点。
 */
    public int getHeight(int elem){
        int num = 0;
        while (elem!=key[elem]){
            elem = key[elem];
            num++;
        }
        return num;
    }

/*
  * @Description
  * 利用高度比较选择合并方向,尽量保持此时最高高度，减少Find时间。
  * @parameters  [elem1, elem2]
  * @return  void
  */
    @Override
    public void fsUnion(int elem1, int elem2) {
        int h1 = getHeight(elem1);
        int h2 = getHeight(elem2);

        int key1 = fsFind(elem1);
        int key2 = fsFind(elem2);

        if(key1!=key2){
            if(h1>=h2) key[elem2] = elem1;
            else key[elem1] = elem2;
        }
    }
}
