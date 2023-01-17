package exam.e4;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,"Eddie",50000L);
		System.out.printf("員工編號:%d%n姓名:%s%n薪資:%d%n",e.getEmpno(),e.getName(),e.getSalary());
		Manager m = new Manager(2,"Cindy", 100000L,50000L);
		System.out.printf("員工編號:%d%n姓名:%s%n薪資:%d%n獎金:%d%n",m.getEmpno(),m.getName(),m.getSalary(),m.getBonus());
	}

}
