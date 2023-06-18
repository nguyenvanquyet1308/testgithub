package gamedomino;
// đây là chương trình chính là nơi các quân cờ thi đấu.

import java.awt.*;
import javax.swing.*; //* là dùng cả gói

public class GameDomino extends JFrame {

    BanCo bc = new BanCo();
    BanCo bcNguoi = new BanCo();
    BanCo bcMay = new BanCo();
    BanCo bcConLai = new BanCo();
    JPanel pnanelkhungTren = new JPanel(new BorderLayout());

    GameDomino() {
//        bc.khoiTao();
//        bc.xaotronngaunhien();
//        chiaQuan();
//        System.out.println("\n ban co nguoi: ");
//        bcNguoi.inra();;
//        System.out.println("\n ban co may: ");
//        bcMay.inra();
//        System.out.println("\n ban co con lai: ");
//        bcConLai.inra();
        //xây dựng giao diện đồ họa
        setTitle("Domino Nguyễn Văn Quyết");
        setSize(1000, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(450, 100);
        //đặt bàn cờ lên domino
        //phía trên có máy và quân cờ còn lại
        add(pnanelkhungTren,BorderLayout.NORTH);
        pnanelkhungTren.add(bcMay,BorderLayout.NORTH);
        bcMay.showQuanCo();
        pnanelkhungTren.add(bcConLai);
        bcConLai.showQuanCo();
        add(bcNguoi, BorderLayout.SOUTH);
        bcNguoi.showQuanCo();

    }

    public void chiaQuan() {//chia cho người 7 quân, chia cho máy 7 quân, còn lại 14 dùng chung.
        for (int i = 0; i < 28; i++) {
            if (i < 7) {
                bcNguoi.mangquanco.add(bc.mangquanco.get(i));//lấy quân thứ i của bc bỏ vô cho người
            } else if (i < 14) {
                bcMay.mangquanco.add(bc.mangquanco.get(i));//lấy 7 quân kế tiếp giao cho máy 
            } else {
                bcConLai.mangquanco.add(bc.mangquanco.get(i));
            }
        }

    }

    public static void main(String[] args) {
        GameDomino d = new GameDomino();
    }
}
