package ex_Tasks;

public class Task022_Polymorphism {
    public static void main(String[] args) {
        MemoryDetails md = new MemoryDetails();
        md.Storage();
        md.Storage("Drive A", 98);
        md.Storage("Drive B", 58, false);
        md.Storage("Drive C", 100, true);
        System.out.println("\n-----------\n");
        MemoryDeletion mdel = new MemoryDeletion();
        mdel.Storage("Drive B", 58, false);
        System.out.println("\n-----------\n");
        mdel.Storage("Drive A", 100, true);

    }
}

class MemoryDetails{
    String drive_name;
    int memory_size;
    boolean is_Full;

    // Method Overloading
    void Storage(){
        System.out.println("Storage is available.");
    }
    void Storage(String drive_name, int memory_size){
        if(memory_size >= 0 && memory_size <= 100) {
            System.out.println(drive_name + " is " + memory_size + " % full.");
        }
        else {
            System.out.println("Memory size should be between 0 and 100 % only");
            System.exit(0);
        }
    }

    void Storage(String drive_name, int memory_size, boolean isFull){
        if(memory_size >= 0 && memory_size <= 100) {
            if (isFull && memory_size == 100) {
                System.out.println(drive_name + " is " + memory_size + " % full. Clear the memory.");
            } else {
                System.out.println(drive_name + " is " + memory_size + " % full. Space is available in the memory.");
            }
        }else{
            System.out.println("Memory size should be between 0 and 100 % only");
            System.exit(0);
        }
    }
}

// Method Overriding
class MemoryDeletion extends MemoryDetails {
    @Override
    void Storage(String drive_name, int memory_size, boolean isFull) {
        if (memory_size >= 0 && memory_size <= 100) {
            if (isFull && memory_size == 100) {
                System.out.println(drive_name + " is " + memory_size + " % full. Clear the memory.");
                System.out.println("Deleting data to clear space...");
                System.out.println(memory_size + " % memory is cleared in " + drive_name);
                System.out.println("Storage space available now.");
            } else {
                System.out.println(drive_name + " is " + memory_size + " % full. Space is available in the memory.");
            }
        }
    }
}