package ѧ������Сϵͳ;

public class StuNode {
	public int id;         //ѧ��
	public String name;    //����
	public String classid; //�༶
	public double score;   //����
	public StuNode next;
	//���ɹ��캯��
	public StuNode(int id, String name, String classid, double score) {
		super();
		this.id = id;
		this.name = name;
		this.classid = classid;
		this.score = score;
	}
}
