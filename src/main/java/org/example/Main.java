package org.example;

import java.util.Scanner;

class graph1 implements Cloneable
{
    Integer x;
    Integer y;
    graph1(Integer a,Integer b)
    {
        x=a;
        y=b;
    }
    boolean equals()
    {
        return x.equals(y);
    }

    graph1 gp()
    {
        try
        {
            return (graph1) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("cloned error");
            return this;
        }
    }
}

class graph
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter x");
        Integer x = inp.nextInt();
        System.out.println("enter y");
        Integer y = inp.nextInt();

        graph1 ob1 = new graph1(x, y);
        graph1 ob2 = ob1.gp();
        System.out.println(ob2.equals());
    }
}