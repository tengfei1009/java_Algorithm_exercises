package 入门四;
import java.util.Scanner;
public class 插火把 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int huo=sc.nextInt();
            int ying=sc.nextInt();
            int [][]arr=new int [200][200];
            for(int i=0;i<huo;i++){
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                x1+=3;
                y1+=3;
                for(int k=x1-1;k<=x1+1;k++){
                    for(int h=y1-1;h<=y1+1;h++){
                        arr[k][h]=1;
                    }
                    arr[x1-2][y1]=1;
                    arr[x1+2][y1]=1;
                    arr[x1][y1-2]=1;
                    arr[x1][y1+2]=1;
                }
            }
            for(int i=0;i<ying;i++){
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                x1+=4;
                y1+=4;
                for(int kuan=x1-3;kuan<x1+2;kuan++){
                    for(int h=y1-3;h<y1+2;h++){
                        arr[kuan][h]=1;
                    }
                }
            }
            int sum=0;
            for(int i=4;i<num+4;i++){
                for(int j=4;j<num+4;j++){
                    if (arr[i][j]==0)
                        sum++;
                }
            }
            System.out.println(sum);
        }
    }
