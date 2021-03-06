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
 * Used for a few events about overlays.
 */
public class VREvent_Overlay_t extends Structure {

    public long overlayHandle;

    public VREvent_Overlay_t() {
        super();
    }

    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("overlayHandle");
    }

    public VREvent_Overlay_t(long overlayHandle) {
        super();
        this.overlayHandle = overlayHandle;
    }

    public VREvent_Overlay_t(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends VREvent_Overlay_t implements Structure.ByReference {
    };

    public static class ByValue extends VREvent_Overlay_t implements Structure.ByValue {
    };
}
