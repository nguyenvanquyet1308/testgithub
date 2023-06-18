package gamedomino;
//là một quân cờ trên bàn cờ 

import java.awt.Insets;
import javax.swing.ImageIcon;

import javax.swing.JButton;

public class QuanCo extends JButton{ //quân cờ là một nút bấm Jbutton

    int left;
    int right; //chú thích vào 2 điểm của quân cờ 
    ImageIcon hinhDung;
    ImageIcon hinhNgang;
    ImageIcon hinhLung;//quân cờ nằm úp

    QuanCo(int left, int right) { //khởi tạo quân cờ
        this.left = left;
        this.right = right;
        hinhDung = new ImageIcon("IMG/DUNG/" + left + right + ".jpg");
        setIcon(hinhDung);
        setMargin(new Insets(0,0,0,0));
    }

    public void inra() {
        System.out.print("[" + left + ":" + right + "]");
    }
}
