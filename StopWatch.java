package Lession3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;

public class StopWatch {
    private String startTime;
    private String endTime;

    public StopWatch() {

    }

    public StopWatch(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String stop() {
        Date thoiGian = new Date();

        //Khai bao dinh dang ngay thang
        SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("ss");

        //parse ngay thang sang dinh dang va chuyen thanh string.
        String showTime = dinhDangThoiGian.format(thoiGian.getTime());
        this.endTime = showTime;
        return this.endTime;

    }

    public String start() {
        Date thoiGian = new Date();

        //Khai bao dinh dang ngay thang
        SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("ss");

        //parse ngay thang sang dinh dang va chuyen thanh string.
        String showTime = dinhDangThoiGian.format(thoiGian.getTime());
        this.startTime = showTime;
        return this.startTime;
    }

    public int getElapsedTime() {
        int start = Integer.parseInt(this.startTime);
        int stop = Integer.parseInt(this.endTime);
        int kq = Math.abs((stop - start));
        return kq;
    }

    public void swap(int xp, int yp) {
        int temp = xp;
        xp = yp;
        yp = temp;
    }

    public void selectionSort(int[] arr, int n) {
        int i, j, min_idx;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                swap(arr[min_idx], arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int i;
        int size = 100000;
        double dem;
        int[] arr = new int[size];
        //Tạo 1 mảng random
        StopWatch watch = new StopWatch();
        System.out.println("Thoi gian bat dau: "+watch.start());

        for (i = 0; i < size - 1; i++) {
            dem = Math.random() * 10;
            arr[i] = (int) Math.round(dem);
        }
        //In mảng
        for (int e : arr) {
            System.out.println(arr[e]);
        }
        System.out.println("Thoi gian ket thuc: "+ watch.stop());
        System.out.println("Thoi gian thuc thi chuong trinh"+ watch.getElapsedTime());
}
}