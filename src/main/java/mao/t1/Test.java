package mao.t1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Project name(项目名称)：java并发编程_CopyOnWriteArrayList
 * Package(包名): mao.t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/16
 * Time(创建时间)： 13:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        System.out.println(list.remove(0));
    }
}
