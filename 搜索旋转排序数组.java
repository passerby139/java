package Lee_code;

import java.util.ArrayList;

public class ËÑË÷Ðý×ªÅÅÐòÊý×é {
	public static void main(String[] args) {
        int [] list = {};
        int i =0;
        
        int x = 5;
        if(list.length == 0)
        	System.out.println(-1);
        else {
            for(i = 0;i<list.length;i++) {
            	if(list[i] == x)
            		break;
            }
            if(i == list.length && list[list.length-1] == x) {
            	System.out.println((i-1));
            }
            else if(i == list.length && list[list.length-1] != x) {
            	System.out.println(-1);
            }
            else {
            	System.out.println(i);
            }
        }
	}
}
