package problem04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		char[][] map = new char[2][20];
		int count = 0;
		int w_count = 0;
		int r_count = 0;
		int pos = -1;
		int chance = 0;
		int chance2 = 0;

		boolean gameover = false;
		boolean success = false;
		
		while(!gameover)
		{
			count = 0;
			w_count = 0;
			r_count = 0;
			pos = -1;
			success = false;
			chance = 0;
			Arrays.fill(map[0],'\u0000');
			Arrays.fill(map[1],'\u0000');
			
			while(map[0][19] != '#' && map[0][19] !='0')
			{
				int rand = (int)(Math.random()*2);

				if(rand == 0 && w_count < 10)
				{
					map[0][count++] = '#';
					w_count++;
				}
				if(rand == 1 && r_count < 10)
				{
					map[0][count++] = '0';
					r_count++;
				}
			}
			while(!success)
			{
				System.out.println("주사위를 굴리려면 엔터키를 눌러주세요");
				sc.nextLine();
				int dice = (int)(Math.random()*4)+1;
				System.out.println(" "+dice);
				
				if(pos + dice > 19)
				{
					success = !success;
					gameover = !gameover;
				}
				map[1][pos+=dice] = '^';
				System.out.println(Arrays.toString(map[0]));
				System.out.println(Arrays.toString(map[1]));
				if(map[0][pos] == '#')
				{
					System.out.println("처음부터 다시시작합니다.");
					Arrays.fill(map[1],'\u0000');
					success = !success;
				}
				Arrays.fill(map[1],'\u0000');
				chance++;
			}
			chance2++;
			
		}
		System.out.println("게임오버! 도전회수 :"+chance+"재시도한 횟수: "+chance+"회");
	}

}
