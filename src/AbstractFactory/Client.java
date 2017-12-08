package AbstractFactory;

public class Client {
    public static void main(String[]args){
//        ComputerEngineer cf = new ComputerEngineer();
//        cf.makeComputer(1,1);
    	
        //创建装机工程师对象
    	ComputerEngineerAbstract cf = new ComputerEngineerAbstract();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new IntelFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);
    }
}