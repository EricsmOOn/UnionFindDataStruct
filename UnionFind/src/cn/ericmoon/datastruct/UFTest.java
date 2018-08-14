package cn.ericmoon.datastruct;

import cn.ericmoon.datastruct.UnionFind.*;

public class UFTest {

    public static void main(String[] args) {

        /*//SlowFast Union Find Test.
        //测试并查集大小为5;
        int size = 5;

        System.out.println("------> 初始化并查集 ...");
        SlowFast sf = new SlowFast(size);

        System.out.println("------> 并查集查询 ...");
        sf.SFPrint();

        System.out.println("------> 合并2,4 ...");
        sf.sfUnion(2,4);

        System.out.println("------> 并查集查询 ...");
        sf.SFPrint();

        System.out.println("------> 合并1,4 ...");
        sf.sfUnion(1,4);

        System.out.println("------> 并查集查询 ...");
        sf.SFPrint();*/



        /*//FastSlow Union Find Test.
        //测试并查集大小为5;
        int size = 5;

        System.out.println("------> 初始化并查集 ...");
        FastSlow fs = new FastSlow(size);

        System.out.println("------> 并查集查询 ...");
        fs.FSPrint();

        System.out.println("------> 合并2,4 ...");
        fs.fsUnion(2,4);

        System.out.println("------> 并查集查询 ...");
        fs.FSPrint();

        System.out.println("------> 合并1,2 ...");
        fs.fsUnion(1,2);

        System.out.println("------> 并查集查询 ...");
        fs.FSPrint();*/




        /*//FFBaseSF Union Find Test.
        //测试并查集大小为5;
        int size = 5;

        System.out.println("------> 初始化并查集 ...");
        FFBaseSF ffsf = new FFBaseSF(size);

        System.out.println("------> 并查集查询 ...");
        ffsf.SFPrint();

        System.out.println("------> 合并2,4 ...");
        ffsf.sfUnion(2,4);

        System.out.println("------> 并查集查询 ...");
        ffsf.SFPrint();

        System.out.println("------> 合并1,4 ...");
        ffsf.sfUnion(1,4);

        System.out.println("------> 并查集查询 ...");
        ffsf.SFPrint();*/


        /*//FFBaseFS Union Find Test.
        //测试并查集大小为5;
        int size = 5;

        System.out.println("------> 初始化并查集 ...");
        FFBaseFS fffs = new FFBaseFS(size);

        System.out.println("------> 并查集查询 ...");
        fffs.FSPrint();

        System.out.println("------> 合并2,4 ...");
        fffs.fsUnion(2,4);

        System.out.println("------> 并查集查询 ...");
        fffs.FSPrint();

        System.out.println("------> 合并1,4 ...");
        fffs.fsUnion(1,4);

        System.out.println("------> 并查集查询 ...");
        fffs.FSPrint();*/


    }
}
