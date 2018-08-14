package cn.ericmoon.datastruct.Application;

import cn.ericmoon.datastruct.UnionFind.FFBaseFS;

import java.util.List;

/**
 * @ProjectName: UnionFind
 * @CoderName: Eric Wong
 * @Date: 2018/8/14
 * @Desc: 并查仪(UFM)的实现。
 */
public class UnionFindMachine extends FFBaseFS{

    int[] key = getKey();

    public UnionFindMachine(int size) {
        super(size);
    }


/*
  * @Description
  * 并查仪交友功能。
  * @parameters  [p1, p2]
  * @return  void
  */
    public void Union(Person p1, Person p2){
        fsUnion(p1.getId(),p2.getId());
        System.out.println("-----> UFM:"+p1.getName()+"和"+p2.getName()+"桃园结义！");
    }


/*
  * @Description
  * 并查仪查询是否存在广义朋友关系，并显示好友链。
  * @parameters  [p1, p2]
  * @return  java.lang.Boolean
  */
    public void cofriend(List<Person> list,Person p1,Person p2){
        int elem = p1.getId();
        while (elem!=key[elem]){
            elem = key[elem];
        }
        int p1bor = elem;

        elem = p2.getId();
        while (elem!=key[elem]){
            elem = key[elem];
        }
        int p2bor = elem;
        if(p1bor==p2bor){
            System.out.println("------------> UFM: 好友链如下:");



            elem = p1.getId();
            System.out.print(p1.getName());
            while (elem!=key[elem]){
                elem = key[elem];
                System.out.print(" -> "+getNameById(list,elem));
            }
            System.out.println();


            System.out.print(p2.getName());
            elem = p2.getId();
            while (elem!=key[elem]){
                elem = key[elem];
                System.out.print(" -> "+getNameById(list,elem));
                System.out.println();
            }

            System.out.println("-----------------------------");
        }else System.out.println("------------> UFM: "+p1.getName()+" 和 "+p2.getName()+" 没有任何朋友关系！");

        System.out.println();
    }

    public static String getNameById(List<Person> list,int id){
        for (Person p : list) {
            if (p.getId() == id) {
                return p.getName();
            }
        }
        return "查无此人";
    }
}