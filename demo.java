/**
 * 简单Java测试演示程序
 * 功能：输出信息、计算、条件判断、循环演示
 */
public class HelloJavaTest {
    // 程序入口方法：Java程序从这里开始运行
    public static void main(String[] args) {
        // 1. 基础输出：打印欢迎信息
        System.out.println("===== Java 简单测试程序开始 =====");
        
        // 2. 定义变量
        String name = "Java学习者";
        int age = 20;
        double score = 95.5;

        // 3. 输出变量信息
        System.out.println("你好：" + name);
        System.out.println("年龄：" + age);
        System.out.println("分数：" + score);

        // 4. 调用自定义方法：做加法计算
        int sum = add(10, 20);
        System.out.println("10 + 20 = " + sum);

        // 5. 条件判断演示
        checkScore(score);

        // 6. 循环演示：打印1~5
        System.out.println("\n循环输出 1~5：");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n===== Java 测试程序运行结束 =====");
    }

    /**
     * 自定义加法方法
     * @param a 数字1
     * @param b 数字2
     * @return 两数之和
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 判断分数等级
     * @param score 分数
     */
    public static void checkScore(double score) {
        System.out.println("\n分数等级判断：");
        if (score >= 90) {
            System.out.println("等级：优秀");
        } else if (score >= 60) {
            System.out.println("等级：及格");
        } else {
            System.out.println("等级：不及格");
        }
    }
}
