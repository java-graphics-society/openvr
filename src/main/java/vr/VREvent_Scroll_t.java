package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 * 
 * used for simulated mouse wheel scroll in overlay space.
 */
public class VREvent_Scroll_t extends Structure {

    public float xdelta, ydelta;    // movement in fraction of the pad traversed since last delta, 1.0 for a full swipe
    public int repeatCount;

    public VREvent_Scroll_t() {
        super();
    }

    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("xdelta", "ydelta", "repeatCount");
    }

    public VREvent_Scroll_t(float xdelta, float ydelta, int repeatCount) {
        super();
        this.xdelta = xdelta;
        this.ydelta = ydelta;
        this.repeatCount = repeatCount;
    }

    public VREvent_Scroll_t(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends VREvent_Scroll_t implements Structure.ByReference {
    };

    public static class ByValue extends VREvent_Scroll_t implements Structure.ByValue {
    };
}
