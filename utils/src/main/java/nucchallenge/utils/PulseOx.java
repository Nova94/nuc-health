package nucchallenge.utils;

import java.io.IOException;

public class PulseOx extends Device {
    protected byte [] bytes = new byte[128];

    public int [] read() throws IOException {
        int pulse = 0;
        int ox = 0;

        if(input != null) {
            /* read in 128 bytes : allows the next two byte size reads to get data */
            input.read(bytes);

            //int x = (int) bytes[0];
            //System.out.println(x);

            /* read in pulse level */
            pulse = input.read();
            /* read in ox level */
            ox = input.read();
            /*int i3 = input.read();
            int i4 = input.read();
           int i5 = input.read();
           */

            /* read in extra byte */
            input.read();

            //System.out.println(ox + " " + pulse + " ");
            //System.out.println();
        } else {
            System.err.println("Error: input Stream is null");
        }

        return new int[]{pulse, ox};
    }

}
