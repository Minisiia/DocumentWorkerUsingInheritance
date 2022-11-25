package document_worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] arrayPro = {"11111","76543","23459","23450","00987","49803","234d5"};
        String [] arrayExp = {"22222","49803","09996","339d3","29804","21389","94850"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 5-значний код доступу:");
        String code = scanner.next();
        boolean pro = false;
        boolean exp = false;
        for (int i = 0; i < arrayPro.length; i++) {
            if (arrayPro[i].equals(code)) {
                pro = true;
            }
        }
        for (int i = 0; i < arrayExp.length; i++) {
            if (arrayExp[i].equals(code)) {
               exp = true;
            }
        }
        if (pro) {
            DocumentWorker proDocumentWorker = new ProDocumentWorker();
            System.out.println("Ви користуєтесь версією Pro. Вам доступні наступні можливості:");
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
        }
        else if (exp) {
            DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println("Ви користуєтесь версією Expert. Вам доступні наступні можливості:");
            expertDocumentWorker.openDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.saveDocument();
        }
        else {
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.println("Ви користуєтесь безкоштовною версією. Вам доступні наступні можливості:");
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }

    }
}
