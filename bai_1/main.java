/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_1;

import java.util.*;

/**
 *
 * @author huyle
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<PartTimeEmployee> partTimeList = new ArrayList<>();
        List<FullTimeEmployee> fullTimeList = new ArrayList<>();
        int partTimeNum = in.nextInt();
        int fullTimeNum = in.nextInt();
        while(partTimeNum-- > 0){
            in.nextLine();
            partTimeList.add(new PartTimeEmployee(in.nextLine(), in.nextInt(), in.nextInt()));
        }
        while(fullTimeNum-- > 0){
            in.nextLine();
            fullTimeList.add(new FullTimeEmployee(in.nextLine(), in.nextInt()));
        }
        System.out.println("Lương của nhân viên bán thời gian:");
        for(PartTimeEmployee x:partTimeList){
            System.out.println(x);
        }
        System.out.println("\nLương của nhân viên toàn thời gian:");
        for(FullTimeEmployee x: fullTimeList){
            System.out.println(x);
        }
    }
    
}

/*
3 4
Đỗ Trung Quân 
25 5
Trần Thanh Thúy
31 6
Nguyễn Hà Phương
20 4
Đoàn Mạnh Long 
50
Nguyễn Hải Quang
45
Phạm Quốc Việt
40
Đào Hà Phương
50
*/