public class stackSurat18 {
    public class StackSurat {
    surat18[] stack;
    int size;
    int top;

    public StackSurat(int size) {
        this.size = size;
        stack = new surat18[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    
    public void push(surat18 srt) {
        if (!isFull()) {
            stack[++top] = srt;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    
    public surat18 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    
    public surat18 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

   
    public void cariSurat(String nama) {
        boolean ketemu = false;

        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMahasiswa);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis: " + stack[i].jenisIzin);
                System.out.println("Durasi: " + stack[i].durasi);
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Surat tidak ditemukan!");
        }
    }
}
}
