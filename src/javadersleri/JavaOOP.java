package javadersleri;

public class JavaOOP {
    public int value;
    public String  name;
    public String lastName;
    private String key="kfhjd34hj34j42l343l";

    //constractor
    public  JavaOOP(int value, String name, String lastName) {
       this.value = value;
        this.name = name;
        this.lastName = lastName;
        System.out.println("Hello World");
    }

    //    method owerloading
    public  JavaOOP() {
        System.out.println("method owerloading");
    }

//    private
    public  JavaOOP(String code) {
        boolean check=code.equals(this.key);
        if(check){
        System.out.println( "method owerloading succes");
        }else{
            System.out.println("fail "+ code);
        }

    }
//        constructor nested
    public JavaOOP(int test) {
            this("Qonaq");                     // 1 parametrli konstruktoru çağırır
            System.out.println("parametrsiz");
        }
}
