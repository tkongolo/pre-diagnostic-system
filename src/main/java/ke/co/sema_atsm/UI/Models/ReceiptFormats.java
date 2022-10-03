package ke.co.sema_atsm.UI.Models;

import ke.co.sema_atsm.Utilities.UtData;
import ke.co.sema_atsm.Utilities.UtJobs;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import static java.awt.print.Printable.NO_SUCH_PAGE;

public class ReceiptFormats {
    public static Printable positiveReceipt(String UIDValue){
        return new Printable() {
            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

                if (page > 0) {
                    return NO_SUCH_PAGE;
                }

                //starting positions
                int x = 5;
                int y = 5;

                int xLarger = 60;
                int yNextAfterLogo = 30;
                int yNextLarger = 20;

                int footerImgSize = 40;

                int startRectX = 0;
                int startRectY = 0;
                int rectWidth = 95;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());

                //first logo
                g.drawImage(UtJobs.getBufImg(UtData.nationalLeprocyPrintOut),xLarger,0,60,
                        60, null);
                y += 60 + yNextAfterLogo;

                //Message
                g.setFont(new Font("Roman", Font.BOLD, 12));
                if(UtData.selectedLanguage.equals("eng")){
                    g.drawString("TUBERCULOSIS IS CURABLE", x, y);
                }else if(UtData.selectedLanguage.equals("swa")){
                    g.drawString(" KIFUA KIKUU INA TIBA", x, y);
                }

                y += yNextAfterLogo;

                //Unique Identifier
                g.setFont(new Font("Roman", Font.PLAIN, 10));
                //get current values
                startRectX = xLarger - 10;
                startRectY = y - 15;
                g.drawString("UNIQUE",xLarger,y);
                y += yNextLarger;
                g.drawString("IDENTIFIER", xLarger,y);
                y +=yNextLarger;
                g.drawString(UIDValue, xLarger, y);
                y += yNextLarger;

                //draw rectangle
                g.drawRect(startRectX, startRectY, rectWidth, (-yNextLarger + startRectY) - 25);
                y += yNextAfterLogo;

                //String positive
                g.setFont(new Font("Roman", Font.BOLD, 10));
                if(UtData.selectedLanguage.equals("eng")){
                    g.drawString("POSITIVE SCREEN FOR TB", xLarger - 30, y);
                }else if(UtData.selectedLanguage.equals("swa")){
                    g.drawString("UNAHITAJI UCHUNGUZI ZAIDI", xLarger - 30, y);
                }

                y += yNextAfterLogo;

                //Message
                g.setFont(new Font("Roman", Font.PLAIN, 10));
                if(UtData.selectedLanguage.equals("eng")){
                    g.drawString("KINDLY VISIT THE TUBERCULOSIS",x, y);
                    y+= yNextLarger;
                    g.drawString("SCREENING TENT FOR FURTHER",x, y);
                    y+= yNextLarger;
                    g.drawString("INVESTIGATION", x, y);

                }else if(UtData.selectedLanguage.equals("swa")){

                    g.drawString("TAFADHALI PITIA KWENYE HEMA",x, y);
                    y+= yNextLarger;
                    g.drawString("KWA UCHUNGUZI ZAIDI WA KIFUA",x, y);
                    y+= yNextLarger;
                    g.drawString("KIKUU", x, y);

                }
                y += yNextAfterLogo;

                //image icons
                g.drawImage(UtJobs.getBufImg(UtData.amrefImgPrintOut),
                        x, y, 64,footerImgSize, null);
                g.drawImage(UtJobs.getBufImg(UtData.craneImgPrintOut),
                        70, y, footerImgSize,footerImgSize, null);
                g.drawImage(UtJobs.getBufImg(UtData.semaImgPrintOut),
                        110, y + 10, 60, 20, null);

//                g.drawImage(UtJobs.getBufImg(UtData.semaImgPrintOut),
//                        x, y + 10, 60, 20, null);
//                g.drawImage(UtJobs.getBufImg(UtData.craneImgPrintOut),
//                        70, y, footerImgSize,footerImgSize, null);
//                g.drawImage(UtJobs.getBufImg(UtData.amrefImgPrintOut),
//                        110, y, 64,footerImgSize, null);
                y += yNextAfterLogo;

                return PAGE_EXISTS;
            }
        };
    }

    public static Printable negativeReceipt(){
        return new Printable() {
            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

                if (page > 0) {
                    return NO_SUCH_PAGE;
                }

                //starting positions
                int x = 5;
                int y = 5;

                int xLarger = 60;
                int yNextAfterLogo = 30;
                int yNextLarger = 20;

                int footerImgSize = 40;

                int startRectX = 0;
                int startRectY = 0;
                int rectWidth = 85;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());

                //first logo
                g.drawImage(UtJobs.getBufImg(UtData.nationalLeprocyPrintOut),xLarger,0,60,
                        60, null);
                y += 60 + yNextAfterLogo;

                //Message
                g.setFont(new Font("Roman", Font.BOLD, 12));
                if(UtData.selectedLanguage.equals("eng")){
                    g.drawString("TUBERCULOSIS IS CURABLE", x, y);
                }else if(UtData.selectedLanguage.equals("swa")){
                    g.drawString(" KIFUA KIKUU INA TIBA", x, y);
                }

                y += yNextAfterLogo;

                //String positive
                g.setFont(new Font("Roman", Font.BOLD, 10));
                if(UtData.selectedLanguage.equals("eng")){
                    g.drawString("NEGATIVE SCREEN FOR TB", xLarger - 30, y);
                }else if(UtData.selectedLanguage.equals("swa")){
                    g.drawString("UKO SAWA KWA SASA", xLarger - 30, y);
                }

                y += yNextAfterLogo;

                //Message
                g.setFont(new Font("Roman", Font.PLAIN, 10));
                if(UtData.selectedLanguage.equals("eng")){
                    g.drawString("IN CASE YOU EXPERIENCE ANY OF",x,y);
                    y += yNextLarger;
                    g.drawString("THE TB SYMPTOMS, KINDLY VISIT",x,y);
                    y += yNextLarger;
                    g.drawString("YOUR NEAREST HEALTH FACILITY",x,y);
                    y += yNextLarger;
                    g.drawString("FOR INVESTIGATIONS",x,y);

                }else if(UtData.selectedLanguage.equals("swa")){
                    g.drawString("IWAPO UTAPATA DALILI ZOZOTE",x,y);
                    y += yNextLarger;
                    g.drawString("ZA KIFUA KIKUU, TAFADHALI",x,y);
                    y += yNextLarger;
                    g.drawString("TEMBELEA KITUO CHOCHOTE CHA",x,y);
                    y += yNextLarger;
                    g.drawString("AFYA KILICHO KARIBU NAWE KWA",x,y);
                    y += yNextLarger;
                    g.drawString("UCHUNGUZI ZAIDI",x,y);
                }
                y += yNextAfterLogo;

                //image icons
                g.drawImage(UtJobs.getBufImg(UtData.amrefImgPrintOut),
                        x, y, 64,footerImgSize, null);
                g.drawImage(UtJobs.getBufImg(UtData.craneImgPrintOut),
                        70, y, footerImgSize,footerImgSize, null);
                g.drawImage(UtJobs.getBufImg(UtData.semaImgPrintOut),
                        110, y + 10, 60, 20, null);

//
//                g.drawImage(UtJobs.getBufImg(UtData.semaImgPrintOut),
//                        x, y + 10, 60, 20, null);
//                g.drawImage(UtJobs.getBufImg(UtData.craneImgPrintOut),
//                        70, y, footerImgSize,footerImgSize, null);
//                g.drawImage(UtJobs.getBufImg(UtData.amrefImgPrintOut),
//                        110, y, 64,footerImgSize, null);
                y += yNextAfterLogo;

                return PAGE_EXISTS;
            }
        };
    }

    public static Printable promotionalMessage(){
        return new Printable() {
            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

                if(page > 0){
                    return NO_SUCH_PAGE;
                }

                int x = 5;
                int y = 5;
                int yNext = 10;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());

                g.setFont(new Font("Roman", Font.PLAIN, 8));

                g.drawString("", x, y);
                y += yNext;

                g.drawImage(UtJobs.getTuberculosisImage(),0,0,190,
                        190, null);
                y += 200;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Served By: Pre-Diagnosis System", x, y);
                y += yNext;
                g.drawString(" " + UtJobs.getNowDateTime(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;


                return PAGE_EXISTS;
            }
        };
    }

    public static Printable promotionalMessageSick(){
        return new Printable() {
            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

                if(page > 0){
                    return NO_SUCH_PAGE;
                }

                int x = 5;
                int y = 5;
                int yNext = 10;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());

                g.setFont(new Font("Roman", Font.PLAIN, 8));
                g.drawString("", x, y);
                y += yNext;

                g.drawImage(UtJobs.getTuberculosisImage(),0,0,190,
                        190, null);
                y += 200;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                if(UtData.selectedLanguage.equals("eng")){
                    g.drawString("", x, y);
                    y += yNext;
                    g.drawString(" KINDLY VISIT THE TUBERCULOSIS",x, y);
                    y+= yNext;
                    g.drawString(" SCREENING TENT FOR FURTHER",x, y);
                    y+= yNext;
                    g.drawString(" INVESTIGATION", x, y);
                    y += yNext;
                    g.drawString("", x, y);
                    y += yNext;
                }else if(UtData.selectedLanguage.equals("swa")){
                    g.drawString("", x, y);
                    y += yNext;
                    g.drawString(" TAFADHALI NENDA KWENYE HEMA",x, y);
                    y+= yNext;
                    g.drawString(" KWA UCHUNGUZI ZAIDI WA KIFUA",x, y);
                    y+= yNext;
                    g.drawString(" KIKUU", x, y);
                    y += yNext;
                    g.drawString("", x, y);
                    y += yNext;
                }

                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Served By: Pre-Diagnosis System", x, y);
                y += yNext;
                g.drawString(" " + UtJobs.getNowDateTime(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;


                return PAGE_EXISTS;
            }
        };
    }


    public static Printable getHospitalReceiptFormat(HospitalReceipt receipt) {
        return new Printable() {

            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                // TODO Auto-generated method stub
                if (page > 0) { /* We have only one page, and 'page' is zero-based */

                    return NO_SUCH_PAGE;
                }

                int x = 5;
                int y = 5;
                int yNext = 10;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());
                /* Now we perform our rendering */

                g.setFont(new Font("Roman", Font.PLAIN, 8));
                g.drawString("", x, y);
                y += yNext;
                g.drawString("          HUDUMA KENYA ", x, y);
                y += yNext;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" ID Number : " + receipt.getUserDetails().getIdNumber(), x, y);
                y += yNext;
                g.drawString(" Phone Number : " + receipt.getUserDetails().getPhoneNumber(), x, y);
                y += yNext;

                g.drawString("", x, y);
                y += yNext;

                g.drawString(" Hospital Name : " + receipt.getHospDetails().getName(), x, y);
                y += yNext;
                g.drawString(" Hospital Location : " + receipt.getHospDetails().getDirections(), x, y);
                y += yNext;

                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Served By: Huduma Pre-Diagnosis System", x, y);
                y += yNext;
                g.drawString(" " + UtJobs.getNowDateTime(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;

                return PAGE_EXISTS;
            }
        };
    }
}
