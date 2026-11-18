import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;


public class Test {
    static void main() {
        String script = "src/main/java/lua/hello.lua";
        Globals globals = JsePlatform.standardGlobals();
        LuaValue chunk = globals.loadfile("src/main/java/lua/hello.lua");
        chunk.call(LuaValue.valueOf(script));
    }
}
