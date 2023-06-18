package gamedomino;
//bàn cờ chứa một mảng các quân cờ

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class BanCo extends JPanel {//bàn cờ là một khung chứa Jpanel

    ArrayList<QuanCo> mangquanco = new ArrayList();

    public void khoiTao() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mangquanco.add(new QuanCo(i, j));
            }
        }
    }

    //in ra 28 quân cờ ra màn hình
    public void inra() {
        for (QuanCo q : mangquanco) {
            q.inra();
        }
    }

    public void showQuanCo() {
        for (QuanCo q: mangquanco) {
            add(q); //đưa quân cờ lên bàn cờ
        }
    }
    public void xaotronngaunhien() {
        Random r = new Random(); //lớp ngẫu nhiên
        int k = r.nextInt(28); //vị trí ngẫu nhiên nằm từ 0-27;
        QuanCo qk; //quân cờ ngẫu nhiên thứ k
        QuanCo qi;//quân cờ ngẫu nhiên thứ i
        for (int i = 0; i < 28; i++) {
            k = r.nextInt(28);
            qk = mangquanco.get(k);//lấy ra quân thứ k
            qi = mangquanco.get(i);//lấy ra quân thứ i
            mangquanco.set(i, qk);//bỏ quân k vào chỗ thứ i
            mangquanco.set(k, qi);//bỏ quân i vào chỗ k
        }
    }

}
