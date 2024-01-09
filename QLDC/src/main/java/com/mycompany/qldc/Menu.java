/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private int n = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    //------------------------------------------Đề cương-------------------------------------------
    //Lưu đề cương
    private void menuLuuDCCQ(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        DeCuong c = new DeCuong();
        String s;
        System.out.print("Nhap ten hoac ma mon hoc muon tao de cuong: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null || qlmh.timMHTheoTen(s) != null) {
            int h = 0;
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. He chinh quy");
            System.out.println("2. He tu xa");
            System.out.println("3. Quay lai");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon he dao tao: ");
            switch (h) {
                case 1:
                    HeDaoTao hd = new HeDaoTao(1, "He chinh quy");
                    c.setHe(hd);
                    break;
                case 2:
                    HeDaoTao he = new HeDaoTao(2, "He tu xa");
                    c.setHe(he);
                    break;
                case 3:
                    menuMain(qlmh, qldc, qlgv);
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
            System.out.println("Nhap muc tieu mon hoc: ");
            c.setMucTieu(sc.nextLine());
            System.out.println("Nhap chuan dau ra mon hoc: ");
            c.setChuanDauRa(sc.nextLine());
            qldc.themDC(c);
        } else {
            System.out.println("Mon hoc khong ton tai!!!");
        }
    }
    
    private void menuLuuDCTX(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        DeCuong c = new DeCuong();
        String s;
        System.out.print("Nhap ten hoac ma mon hoc muon tao de cuong: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null || qlmh.timMHTheoTen(s) != null) {
            int h = 0;
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. He chinh quy");
            System.out.println("2. He tu xa");
            System.out.println("3. Quay lai");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon he dao tao: ");
            switch (h) {
                case 1:
                    HeDaoTao hd = new HeDaoTao(1, "He chinh quy");
                    c.setHe(hd);
                    break;
                case 2:
                    HeDaoTao he = new HeDaoTao(2, "He tu xa");
                    c.setHe(he);
                    break;
                case 3:
                    menuMain(qlmh, qldc, qlgv);
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
            System.out.println("Nhap muc tieu mon hoc: ");
            c.setMucTieu(sc.nextLine());
            System.out.println("Nhap chuan dau ra mon hoc: ");
            c.setChuanDauRa(sc.nextLine());
            qldc.themDC(c);
        } else {
            System.out.println("Mon hoc khong ton tai!!!");
        }
    }

    
    //menu hệ đào tạo
    private void menuHeDaoTao(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. He chinh quy");
            System.out.println("2. He tu xa");
            System.out.println("3. Quay lai menu");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuLuuDCCQ(qlmh, qldc, qlgv);
                    break;
                case 2:
                    menuLuuDCTX(qlmh, qldc, qlgv);
                    break;
                case 3:
                    menuMain(qlmh, qldc, qlgv);
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 4);
    }

    
    //menu đề cương
    private void menuDeCuong(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai nemu chinh");
            System.out.println("7. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuHeDaoTao(qlmh, qldc, qlgv);
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuMain(qlmh, qldc, qlgv);
                    break;
                case 7:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }
    
    
    //----------------------------------------------------Môn học-----------------------------------
    
    //xóa môn học
    private void xoaMH(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        String s;
        sc.nextLine();
        System.out.print("Nhap ten hoac ma mon hoc muon xoa: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null || qlmh.timMHTheoTen(s) != null) {
            if (qlmh.timMHTheoId(s) != null) {
                MonHoc m = qlmh.timMHTheoId(s);
                System.out.println("-----------------------Mon Hoc------------------------");
                System.out.println("Nhap ma mon hoc: " + m.getId());
                System.out.println("Nhap ten mon hoc: " + m.getTen());
                System.out.println("Nhap ma mo ta mon hoc: " + m.getMoTa());
                System.out.println("Nhap so tin chi: " + m.getSoTC());
                System.out.println("-------------------------end--------------------------");
                System.out.println("Co phai mon hoc muon xoa?");
                System.out.println("1. Xoa");
                System.out.println("2. Tim lai");
                System.out.println("3. Quay lai menu mon hoc");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        if(qlmh.xoaMH(m)== true){
                            System.out.println("Xoa thanh cong!!!");
                        }else{
                                System.out.println("Xoa that bai!!!");}
                        System.out.println("Ban co muon tiep tuc xoa?");
                        System.out.println("1. Co");
                        System.out.println("2. Khong");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                xoaMH(qlmh, qldc, qlgv);
                                break;
                            case 2:
                                menuMonHoc(qlmh, qldc, qlgv);
                                break;
                            default:
                                System.out.println("Khong hop le!!!");
                        }
                        break;
                    case 2:
                        xoaMH(qlmh, qldc, qlgv);
                        break;
                    case 3:
                        menuMonHoc(qlmh, qldc, qlgv);
                        break;
                    default:
                        System.out.println("Khong hop le!!!");
                }
            } else {
                MonHoc m = qlmh.timMHTheoTen(s);
                System.out.println("-----------------------Mon Hoc------------------------");
                System.out.print("Nhap ma mon hoc: " + m.getId());
                System.out.print("Nhap ten mon hoc: " + m.getTen());
                System.out.print("Nhap ma mo ta mon hoc: " + m.getMoTa());
                System.out.print("Nhap so tin chi: " + m.getSoTC());
                System.out.println("-------------------------end--------------------------");
                n = sc.nextInt();
                 System.out.println("Co phai mon hoc muon xoa?");
                System.out.println("1. Xoa");
                System.out.println("2. Tim lai");
                System.out.println("3. Quay lai menu mon hoc");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        if(qlmh.xoaMH(m)== true){
                            System.out.println("Xoa thanh cong!!!");
                        }else{
                                System.out.println("Xoa that bai!!!");}
                        System.out.println("Ban co muon tiep tuc xoa?");
                        System.out.println("1. Co");
                        System.out.println("2. Khong");
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                xoaMH(qlmh, qldc, qlgv);
                                break;
                            case 2:
                                menuMonHoc(qlmh, qldc, qlgv);
                                break;
                            default:
                                System.out.println("Khong hop le!!!");
                        }
                        break;
                    case 2:
                        xoaMH(qlmh, qldc, qlgv);
                        break;
                    case 3:
                        menuMonHoc(qlmh, qldc, qlgv);
                        break;
                    default:
                        System.out.println("Khong hop le!!!");
                }
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!");
        }
    }
    
    
    //tìm kiếm môn học
    private void timMH(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        String s;
        sc.nextLine();
        System.out.print("Nhap ten hoac ma mon hoc muon tim: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null || qlmh.timMHTheoTen(s) != null) {
            if (qlmh.timMHTheoId(s) != null) {
                MonHoc m = qlmh.timMHTheoId(s);
                System.out.println("-----------------------Mon Hoc------------------------");
                System.out.println("Nhap ma mon hoc: " + m.getId());
                System.out.println("Nhap ten mon hoc: " + m.getTen());
                System.out.println("Nhap ma mo ta mon hoc: " + m.getMoTa());
                System.out.println("Nhap so tin chi: " + m.getSoTC());
                if (m.getDstr().size() > 0) {
                    System.out.println("Danh sach mon hoc truoc: ");
                    int i = 0;
                    for (MonHoc h : m.getDstr()) {
                        System.out.println(i + ". " + h.getTen());
                        i++;
                    }
                }else{
                    System.out.println("Danh sach mon hoc truoc: Khong co");
                }
                if(m.getDstq().size()>0){
                    System.out.println("Danh sach mon hoc tien quyet: ");
                    int i = 0;
                    for (MonHoc h : m.getDstq()) {
                        System.out.println(i + ". " + h.getTen());
                        i++;
                    }
                }else{
                    System.out.println("Danh sach mon hoc tien quyet: Khong co");
                }
                System.out.println("-------------------------end--------------------------");
                System.out.println("Ban tiep tuc xem hay quay lai menu mon hoc?");
                System.out.println("1. Tiep tuc");
                System.out.println("2. Quay lai");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        timMH(qlmh, qldc, qlgv);
                        break;
                    case 2:
                        menuMonHoc(qlmh, qldc, qlgv);
                        break;
                    default:
                        System.out.println("Khong hop le!!!");
                }
            } else {
                MonHoc m = qlmh.timMHTheoTen(s);
                System.out.println("-----------------------Mon Hoc------------------------");
                System.out.print("Nhap ma mon hoc: " + m.getId());
                System.out.print("Nhap ten mon hoc: " + m.getTen());
                System.out.print("Nhap ma mo ta mon hoc: " + m.getMoTa());
                System.out.print("Nhap so tin chi: " + m.getSoTC());
                if (m.getDstr().size() > 0) {
                    System.out.println("Danh sach mon hoc truoc: ");
                    int i = 0;
                    for (MonHoc h : m.getDstr()) {
                        System.out.println(i + ". " + h.getTen());
                        i++;
                    }
                }else{
                    System.out.println("Danh sach mon hoc truoc: Khong co");
                }
                if(m.getDstq().size()>0){
                    System.out.println("Danh sach mon hoc tien quyet: ");
                    int i = 0;
                    for (MonHoc h : m.getDstq()) {
                        System.out.println(i + ". " + h.getTen());
                        i++;
                    }
                }else{
                    System.out.println("Danh sach mon hoc tien quyet: Khong co");
                }
                System.out.println("-------------------------end--------------------------");
                n = sc.nextInt();
                System.out.println("Ban tiep tuc xem hay quay lai menu mon hoc?");
                System.out.println("1. Tiep tuc");
                System.out.println("2. Quay lai");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        timMH(qlmh, qldc, qlgv);
                        break;
                    case 2:
                        menuMonHoc(qlmh, qldc, qlgv);
                        break;
                    default:
                        System.out.println("Khong hop le!!!");
                }
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!");
        }
    }

    
    //xem ds môn học
    private void hienThiDsMH(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        int i = 0;
        System.out.println("-----------------------Danh sach mon hoc------------------------");
        for (MonHoc m : qlmh.getMh()) {
            System.out.println("Nhap ten mon hoc: " + m.getTen());
            i++;
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc xem hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1:
                hienThiDsMH(qlmh, qldc, qlgv);
                break;
            case 2:
                menuMonHoc(qlmh, qldc, qlgv);
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
    }

    
    //menu quay lại Lưu môn học
    private void menuQuaylaiMH(MonHoc m, QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: " + m.getId());
        System.out.print("Nhap ten mon hoc: " + m.getTen());
        System.out.print("Nhap ma mo ta mon hoc: " + m.getMoTa());
        System.out.print("Nhap so tin chi: " + m.getSoTC());
        if (m.getDstr().size() <= 3) {
            if (m.getDstr().size() > 0) {
                int i = 0;
                for (MonHoc h : m.getDstr()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            }
            System.out.println("Nhap mon hoc truoc: 1. Co - 2. Khong");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuMhT(m, qlmh, qldc, qlgv);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } else {
            int i = 0;
            for (MonHoc h : m.getDstr()) {
                System.out.println(i + ". " + h.getTen());
                i++;
            }
        }
        if (m.getDstq().size() <= 3) {
            if (m.getDstr().size() > 0) {
                int i = 0;
                for (MonHoc h : m.getDstr()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            }
            System.out.println("Nhap mon hoc tien quyet: 1. Co - 2. Khong");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuMhTQ(m, qlmh, qldc, qlgv);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } else {
            int i = 0;
            for (MonHoc h : m.getDstr()) {
                System.out.println(i + ". " + h.getTen());
                i++;
            }
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1:
                qlmh.themMH(m);
                menuLuuMHCSN(qlmh, qldc, qlgv);
                break;
            case 2:
                qlmh.themMH(m);
                menuMonHoc(qlmh, qldc, qlgv);
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
    }

    
    //lưu môn học tiên quyết
    private void menuMhTQ(MonHoc m, QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        String s;
        System.out.println("-----------------------Mon hoc tien quyet------------------------");
        List<MonHoc> mh = new ArrayList<>();
        mh = m.getDstq();
        do {
            if(mh.size()>0){
                int i = 0;
                for(MonHoc h: mh){
                    System.out.println(i+". "+h.getTen());
                    i++;
                }
            }
            System.out.print("Nhap ma mon hoc hoac ten mon hoc: ");
            s = sc.nextLine();
            if (qlmh.timMHTheoTen(s) != null || qlmh.timMHTheoId(s) != null) {
                if (qlmh.timMHTheoTen(s) != null) {
                    mh.add(qlmh.timMHTheoTen(s));
                }
                if (qlmh.timMHTheoId(s) != null) {
                    mh.add(qlmh.timMHTheoId(s));
                }
            } else {
                System.out.print("Mon hoc khong ton tai!!!");
            }
            System.out.println("-----------------------------end--------------------------------");
            System.out.println("Nhap tiep hoac thoat");
            System.out.println("1. Nhap tiep");
            System.out.println("2. Thoat");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuMhTQ(m, qlmh, qldc, qlgv);
                    break;
                case 2:
                    m.setDstq(mh);
                    menuQuaylaiMH(m, qlmh, qldc, qlgv);
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (mh.size() > 4);
        m.setDstq(mh);
        menuQuaylaiMH(m, qlmh, qldc, qlgv);
    }

    
    //lưu môn học trước
    private void menuMhT(MonHoc m, QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        String s;
        System.out.println("-----------------------Mon hoc truoc------------------------");
        List<MonHoc> mh = new ArrayList<>();
        mh = m.getDstr();
        do {
            if(mh.size()>0){
                int i = 0;
                for(MonHoc h: mh){
                    System.out.println(i+". "+h.getTen());
                    i++;
                }
            }
            System.out.print("Nhap ma mon hoc hoac ten mon hoc: ");
            s = sc.nextLine();
            if (qlmh.timMHTheoTen(s) != null || qlmh.timMHTheoId(s) != null) {
                if (qlmh.timMHTheoTen(s) != null) {
                    mh.add(qlmh.timMHTheoTen(s));
                }
                if (qlmh.timMHTheoId(s) != null) {
                    mh.add(qlmh.timMHTheoId(s));
                }
            } else {
                System.out.print("Mon hoc khong ton tai!!!");
            }
            System.out.println("-----------------------------end--------------------------------");
            System.out.println("Nhap tiep hoac thoat");
            System.out.println("1. Nhap tiep");
            System.out.println("2. Thoat");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuMhT(m, qlmh, qldc, qlgv);
                    break;
                case 2:
                    m.setDstr(mh);
                    menuQuaylaiMH(m, qlmh, qldc, qlgv);
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (mh.size() > 4);
        m.setDstr(mh);
        menuQuaylaiMH(m, qlmh, qldc, qlgv);
    }

    
    //lưu môn học
    private void menuLuuMHCS(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        MonHoc m = new MonHoc();
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: ");
        m.setId(sc.nextLine());
        sc.nextLine();
        System.out.print("Nhap ten mon hoc: ");
        m.setTen(sc.nextLine());
        System.out.print("Nhap ma mo ta mon hoc: ");
        m.setMoTa(sc.nextLine());
        System.out.print("Nhap so tin chi: ");
        m.setSoTC(sc.nextFloat());
        try {
            qlmh.themMH(m);
        } catch (ParseException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1:
                menuLuuMHCS(qlmh, qldc, qlgv);
                break;
            case 2:
                menuMonHoc(qlmh, qldc, qlgv);
                break;
            default:
                System.out.println("Khong hop le!!!");

        }
    }

    private void menuLuuMHN(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        MonHoc m = new MonHoc();
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: ");
        m.setId(sc.nextLine());
        System.out.print("Nhap ten mon hoc: ");
        m.setTen(sc.nextLine());
        System.out.print("Nhap ma mo ta mon hoc: ");
        m.setMoTa(sc.nextLine());
        System.out.print("Nhap so tin chi: ");
        m.setSoTC(sc.nextFloat());
        System.out.println("Nhap mon hoc truoc: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1:
                menuMhT(m, qlmh, qldc, qlgv);
                break;
            case 2:
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
        System.out.println("Nhap mon hoc tien quyet: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1:
                menuMhTQ(m, qlmh, qldc, qlgv);
                break;
            case 2:
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1:
                qlmh.themMH(m);
                menuLuuMHCSN(qlmh, qldc, qlgv);
                break;
            case 2:
                qlmh.themMH(m);
                menuMonHoc(qlmh, qldc, qlgv);
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
    }
    
    private void menuLuuMHCSN(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        MonHoc m = new MonHoc();
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: ");
        m.setId(sc.nextLine());
        System.out.print("Nhap ten mon hoc: ");
        m.setTen(sc.nextLine());
        System.out.print("Nhap ma mo ta mon hoc: ");
        m.setMoTa(sc.nextLine());
        System.out.print("Nhap so tin chi: ");
        m.setSoTC(sc.nextFloat());
        System.out.println("Nhap mon hoc truoc: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1:
                menuMhT(m, qlmh, qldc, qlgv);
                break;
            case 2:
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
        System.out.println("Nhap mon hoc tien quyet: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1:
                menuMhTQ(m, qlmh, qldc, qlgv);
                break;
            case 2:
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1:
                qlmh.themMH(m);
                menuLuuMHCSN(qlmh, qldc, qlgv);
                break;
            case 2:
                qlmh.themMH(m);
                menuMonHoc(qlmh, qldc, qlgv);
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
    }
    
    
    //menu khối kiến thức môn học
    private void menuKhoiKienThuc(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Co so");
            System.out.println("2. Co so nganh");
            System.out.println("3. Chuyen nganh");
            System.out.println("4. Quay lai menu mon hoc");
            System.out.println("5. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuLuuMHCS(qlmh, qldc, qlgv);
                    break;
                case 2:
                    menuLuuMHN(qlmh, qldc, qlgv);
                    break;
                case 3:
                    menuLuuMHCSN(qlmh, qldc, qlgv);
                    break;
                case 4:
                    menuMonHoc(qlmh, qldc, qlgv);
                    break;
                case 5:
                      System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }
    
    
    //menu môn học
    private void menuMonHoc(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        do {
            System.out.println("-----------------------menu subject------------------------");
            System.out.println("1. Them mon hoc");
            System.out.println("2. Sua mon hoc");
            System.out.println("3. Xoa mon hoc");
            System.out.println("4. Tim kiem mon hoc");
            System.out.println("5. Hien thi danh sach mon hoc");
            System.out.println("6. Quay lai nemu chinh");
            System.out.println("7. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuKhoiKienThuc(qlmh, qldc, qlgv);
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    xoaMH(qlmh, qldc, qlgv);
                    break;
                case 4:
                    timMH(qlmh, qldc, qlgv);
                    break;
                case 5:
                    timMH(qlmh, qldc, qlgv);
                    break;
                case 6:
                    menuMain(qlmh, qldc, qlgv);
                    break;
                case 7:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }
    
    
    //menu chính
    public void menuMain(QLMH qlmh, QLDCM qldc, QLGV qlgv) throws ParseException {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Quan ly mon hoc");
            System.out.println("2. Quan ly de cuong mon hoc");
            System.out.println("4. Tim kiem mon hoc");
            System.out.println("5. Tim kiem de cuong mon hoc theo ma giang vien");
            System.out.println("6. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    menuMonHoc(qlmh, qldc, qlgv);
                    break;
                case 2:
                    menuDeCuong(qlmh, qldc, qlgv);
                    break;
                case 3:
                    System.out.println("Cam on da su dung");
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                case 5:
                    System.out.println("Cam on da su dung");
                    break;
                case 6:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }
}
