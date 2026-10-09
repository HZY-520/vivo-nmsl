# Xposed / LSPosed 模块入口
-keep class com.vivo.cnm.lico.HookEntry { *; }
-keep class com.vivo.cnm.lico.MainActivity { *; }
-keep class com.vivo.cnm.lico.EntryActivity { *; }
-keep class com.vivo.cnm.lico.DesktopEntry { *; }
-keep class com.vivo.cnm.lico.StatusProbe { *; }

-keepattributes *Annotation*, InnerClasses, Signature, SourceFile, LineNumberTable

-dontwarn io.github.libxposed.**
