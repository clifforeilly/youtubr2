import com.github.axet.vget.VGet;

import java.io.File;
import java.net.URL;

public class youtubr {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
            //String url = args[0];
            String url = "https://www.youtube.com/watch?v=7MqkEZn8pN4";
            // ex: "/Users/axet/Downloads"

            //String path = args[1];
            String path = "/Users/clifforeilly/dev/youtubr/vids";

            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}