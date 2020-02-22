package dierci;
import java.util.Scanner;
class xueSheng{
	String name;
	double chengji;
	
	void student(String a,double t) {
		this.name=a;
		this.chengji=t;
	}//构造
	
	static xueSheng[] inputstudent(int n){
		Scanner scan =new Scanner(System.in);
		xueSheng[] x=new xueSheng[n+1];
		System.out.println("请以此输入姓名和成绩：");
		for(int i=1;i<=n;i++) {	
			System.out.println("输入第"+i+"个人的 名字");
			String a=scan.next();
			System.out.println("输入第"+i+"个人的成绩");
			double t=scan.nextDouble();
			x[i].student(a, t);
		}
		scan.close();
		return x;
	}//输入

	public void sort(int n,xueSheng v[]){
		xueSheng t;
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++)
			if(v[i].chengji<v[j].chengji)
				{t=v[i];v[i]=v[j];v[j]=t;}
		}
	}//排序
	
	void pt(){
		System.out.println("学生姓名： "+name);
		System.out.println("学生绩点成绩： "+chengji);
	}//打印信息
}

class zhiGong{
	String name;
	double year;
	void gongRen(String a,double t) {
		this.name=a;
		this.year=t;
	}//构造
static	zhiGong[] inputgongren(int n){
		Scanner scan =new Scanner(System.in);
		zhiGong[]z=new zhiGong[n+1];
		
		for(int j=1;j<n+1;j++) {
			System.out.println("输入第"+j+"个人的 名字");
			String a=scan.nextLine();
			System.out.println("输入第"+j+"个人的 工作年限");
			double t=scan.nextDouble();
			z[j].gongRen(a, t);
		}
		scan.close();
	   return z;
	}//输入
	public void sort(int n,zhiGong v[])
	{
		zhiGong t;
		for(int i=1;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			if(v[i].year<v[j].year)
				{t=v[i];v[i]=v[j];v[j]=t;}
		}
	}//排序
	void pt()
	{
		System.out.println("学生姓名： "+name);
		System.out.println("学生绩点成绩： "+year);
	}//打印信息
}

public class 题目1 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String a=scan.next();
		if(a.equals("学生")) {
			System.out.println("请输入要输入的人数：");
			int n;
			n=scan.nextInt();
			xueSheng[] x=new xueSheng[n+1];
			x=xueSheng.inputstudent(n);
			xueSheng q=new xueSheng();
			q.sort(n,x);
			for (int i=1;i<=n;i++){		
				x[i].pt();
				System.out.println("");}
}
		else if(a.equals("职工")) {
			System.out.println("请输入要输入的人数：");
			int n=scan.nextInt();
			zhiGong[] x=new zhiGong[n+1];
			x=zhiGong.inputgongren(n);
			zhiGong q=new zhiGong();
			q.sort(n, x);
			for (int i=1;i<=n;i++){		
				x[i].pt();
				System.out.println("");
	}
}
		else 
			System.out.println("不可输入");
	scan.close();
	}
}