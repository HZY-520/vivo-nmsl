# vivoCNM

vivo / OriginOS 原子工作台解锁与增强模块（Xposed / LSPosed 模块）。

- 应用名：vivoCNM
- 版本号：1.0
- 包名：com.vivo.cnm.lico
- minSdk：28
- targetSdk / compileSdk：37

## 功能

- 解锁 OriginOS 原子工作台入口
- 手势进入原子工作台
- 桌面快捷方式一键进入
- 模块运行状态检测

## 工程结构

```
vivoCNM/
├── settings.gradle
├── build.gradle
├── gradle.properties
└── app/
    ├── build.gradle
    ├── proguard-rules.pro
    └── src/main/
        ├── AndroidManifest.xml
        ├── java/                # 应用与依赖源码
        ├── res/                 # 资源
        ├── assets/              # 基线 profile 等
        ├── jniLibs/             # native 库
        └── resources/META-INF/  # Xposed 模块元数据（xposed/services）
```

## Xposed 模块元数据

`app/src/main/resources/META-INF/` 下的 `xposed/`（`java_init.list`、`module.prop`、`scope.list`）
在打包时会进入 APK 根目录的 `META-INF/xposed/`，由 LSPosed 读取。

## 构建

```bash
./gradlew :app:assembleRelease
```

构建产物位于 `app/build/outputs/apk/release/`。

> 说明：本工程源码由反编译还原而来，用于学习与研究。部分依赖版本按 APK 内记录填写，
> 直接构建可能需要按实际 SDK / 依赖仓库情况微调。
