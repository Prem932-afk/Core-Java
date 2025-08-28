//1. Folder Create

import java.io.File;

class FolderCreate
{
    public static void main(String[] args) 
    {
        File file=new File("myFolder");
        if(!file.exists())
        {
            file.mkdir();
            System.out.println("Folder is created");
        }    
    }
}