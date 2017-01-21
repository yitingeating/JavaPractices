package ElementsOfProgramming.BuiltinTypesOfData;

public class SumOfTwoDice {

	public static void main(String[] args) {
		int c = 6;
        int a = 1 + (int) (Math.random() * c);
        int b = 1 + (int) (Math.random() * c);
        int sum = a + b;
        System.out.println(sum);
        System.out.print("思考题答案：因为Math本来他喵的就是个类吧");
		// TODO Auto-generated method stub
        
        System.out.println("思考题正确答案: 因为random方法是一个静态方法，换句话说是个类方法而不是实例方法，所以不需要实例化，不理解的话，继续向后学");
	}//思考题纯属瞎猜的

}
