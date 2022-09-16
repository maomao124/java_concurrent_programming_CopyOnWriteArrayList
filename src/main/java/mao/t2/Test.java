package mao.t2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Project name(项目名称)：java并发编程_CopyOnWriteArrayList
 * Package(包名): mao.t2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/16
 * Time(创建时间)： 13:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        List<Integer> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                list.remove(0);
                System.out.println(list);
            }
        }).start();

        Thread.sleep(1000);

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
