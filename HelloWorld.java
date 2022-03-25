public class HelloWorld{

        public static void main(String[] args){

                System.out.println("Hello World!");

                System.out.println("hehe");
                // 下面一行输出语句是在 hot-fix 分支上新增的
                System.out.println("hot-fix: content");

                // 下面一行输出语句是在 master 分支上新增的
                System.out.println("master: content");

                // 下面一行输出语句还是在 host-fix 分支上新增的
                System.out.println("hot-fix: content2");

        }

}
