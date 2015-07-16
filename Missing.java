import java.io.*;
import java.util.*;
public class Missing{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		for(int i=1;i<in.length();i++){
			int fm[]={-1,-1};
			boolean nn[]=new boolean[1];
			if(findMissing(i,fm,in,nn)){
				StringBuffer bc = new StringBuffer(in);
				int index = fm[1];
				int missing = fm[0];
				bc.insert(index,missing);
				boolean b[]={true};
				findMissing(i,fm,bc.toString(),b);
				if(!b[0]){
					System.out.println(missing);
					break;
				}}}}
	public static boolean findMissing(int i,int fm[],String in,boolean bool[]){
		int a = Integer.parseInt(in.substring(0,i));
		String ai = ""+a;
		int index = ai.length();
		while(index<in.length()){
			int b=a+1;int c=a+2;
			if(in.indexOf(""+b)==index){
				index += (""+b).length();
				a=b;}
			else if(in.indexOf(""+c) == index){
				fm[0]=c-1;
				fm[1]=index;
				return true;}
			else{return false;}
		}
		bool[0]=false;
		return false;	}}
