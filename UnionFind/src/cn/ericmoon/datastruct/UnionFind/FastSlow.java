package cn.ericmoon.datastruct.UnionFind;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: UnionFind
 * @CoderName: Eric Wong
 * @Date: 2018/8/14
 * @Desc: 快 Union 慢 Find 的 Union-Find 实现。
 */
public class FastSlow{

    private int[] key;

    public int[] getKey() {
        return key;
    }

    /**
     * @Description
     * 快 Union 慢 Find 的 Union-Find 的构造函数初始化。
     * @parameters  [size]
     * @return  int[]
     */
    public FastSlow(int size) {
        key = new int[size];
        for (int i = 0; i < size; i++) {
            key[i] = i;
        }
    }

/**
  * @Description
  * while循环寻找根元素,此处如果元素根节点高度很高则非常耗时。
  * @parameters  [elem]
  * @return  int
  */
    public int fsFind(int elem) {
        while (elem!=key[elem]){
            elem = key[elem];
        }
        return elem;
    }

/**
  * @Description
  * 快速Union的原理在于不需要更改全数组。
  * @parameters  [elem1, elem2]
  * @return  void
  */
    public void fsUnion(int elem1, int elem2) {
        int key1 = fsFind(elem1);
        int key2 = fsFind(elem2);
        if(key1!=key2){
            key[elem1] = elem2;
        }
    }


/**
  * @Description
  * 辅助方法，不计入性能。
  * 分组输出方法。
  * @parameters  []
  * @return  void
  */
    public void FSPrint(){
        for (int elem = 0; elem < key.length; elem++) {
            System.out.print(elem+" ");
            int elemi = elem;
            while (elemi!=key[elemi]){
                elemi = key[elemi];
            }
            System.out.println("属于第"+key[elemi]+"组..");
        }
    }
}
