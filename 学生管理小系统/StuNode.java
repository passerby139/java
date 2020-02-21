package 学生管理小系统;

public class StuNode {
	public int id;         //学号
	public String name;    //姓名
	public String classid; //班级
	public double score;   //分数
	public StuNode next;
	//生成构造函数
	public StuNode(int id, String name, String classid, double score) {
		super();
		this.id = id;
		this.name = name;
		this.classid = classid;
		this.score = score;
	}
}
