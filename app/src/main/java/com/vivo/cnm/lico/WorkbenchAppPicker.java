package com.vivo.cnm.lico;

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.vivo.cnm.lico.WorkbenchAppPicker;
import defpackage.ac;
import defpackage.dp;
import defpackage.ei0;
import defpackage.eq;
import defpackage.fs0;
import defpackage.j2;
import defpackage.kw;
import defpackage.ln0;
import defpackage.lw;
import defpackage.m20;
import defpackage.mr;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.t10;
import defpackage.tq;
import defpackage.u2;
import defpackage.um;
import defpackage.vb0;
import defpackage.z6;
import defpackage.ze;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class WorkbenchAppPicker {
    private static final String ROOT = "com.android.wm.shell.vivomultitask.";
    private static final String TAG = "AddApp";
    private static final String UI = "com.android.wm.shell.vivomultitask.vivomultitaskui.VivoMultiTaskUiModel";
    private static Session active;
    public static final WorkbenchAppPicker INSTANCE = new WorkbenchAppPicker();
    private static final Handler main = new Handler(Looper.getMainLooper());
    private static final AtomicLong generation = new AtomicLong();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
    public static final class Entry {
        private final ComponentName component;
        private final Drawable icon;
        private final String label;

        public Entry(ComponentName componentName, String str, Drawable drawable) {
            componentName.getClass();
            str.getClass();
            this.component = componentName;
            this.label = str;
            this.icon = drawable;
        }

        public static /* synthetic */ Entry copy$default(Entry entry, ComponentName componentName, String str, Drawable drawable, int i, Object obj) {
            if ((i & 1) != 0) {
                componentName = entry.component;
            }
            if ((i & 2) != 0) {
                str = entry.label;
            }
            if ((i & 4) != 0) {
                drawable = entry.icon;
            }
            return entry.copy(componentName, str, drawable);
        }

        public final ComponentName component1() {
            return this.component;
        }

        public final String component2() {
            return this.label;
        }

        public final Drawable component3() {
            return this.icon;
        }

        public final Entry copy(ComponentName componentName, String str, Drawable drawable) {
            componentName.getClass();
            str.getClass();
            return new Entry(componentName, str, drawable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return lw.i(this.component, entry.component) && lw.i(this.label, entry.label) && lw.i(this.icon, entry.icon);
        }

        public final ComponentName getComponent() {
            return this.component;
        }

        public final Drawable getIcon() {
            return this.icon;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int hashCode = (this.label.hashCode() + (this.component.hashCode() * 31)) * 31;
            Drawable drawable = this.icon;
            return hashCode + (drawable == null ? 0 : drawable.hashCode());
        }

        public String toString() {
            return "Entry(component=" + this.component + ", label=" + this.label + ", icon=" + this.icon + ")";
        }
    }

    /* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
    public static final class Session {
        private BaseAdapter adapter;
        private final AtomicBoolean closed;
        private final Object coordinator;
        private final Context ctx;
        private AlertDialog dialog;
        private TextView empty;
        private List<Entry> entries;
        private final ClassLoader loader;
        private final Object model;
        private boolean receiverRegistered;
        private final int rootId;
        private final WorkbenchAppPicker$Session$screenReceiver$1 screenReceiver;
        private EditText search;
        private boolean selected;
        private List<Entry> shown;
        private final int theme;
        private final ContextThemeWrapper themed;
        private final int userId;
        private final ExecutorService worker;

        public Session(Object obj, Object obj2, Context context, ClassLoader classLoader, int i, int i2) {
            obj.getClass();
            obj2.getClass();
            context.getClass();
            classLoader.getClass();
            this.model = obj;
            this.coordinator = obj2;
            this.ctx = context;
            this.loader = classLoader;
            this.rootId = i;
            this.userId = i2;
            this.closed = new AtomicBoolean(false);
            this.worker = Executors.newSingleThreadExecutor();
            this.theme = android.R.style.Theme.DeviceDefault.DayNight;
            this.themed = new ContextThemeWrapper(context, android.R.style.Theme.DeviceDefault.DayNight);
            um umVar = um.e;
            this.entries = umVar;
            this.shown = umVar;
            this.screenReceiver = new WorkbenchAppPicker$Session$screenReceiver$1(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int dp(int i) {
            return (int) ((i * this.ctx.getResources().getDisplayMetrics().density) + 0.5f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void filter() {
            EditText editText = this.search;
            if (editText == null) {
                lw.E("search");
                throw null;
            }
            String obj = editText.getText().toString();
            obj.getClass();
            int length = obj.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = t10.z(obj.charAt(!z ? i : length));
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj2 = obj.subSequence(i, length + 1).toString();
            List<Entry> list = this.entries;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                Entry entry = (Entry) obj3;
                if (!ln0.D(entry.getLabel(), obj2, true)) {
                    String packageName = entry.getComponent().getPackageName();
                    packageName.getClass();
                    if (ln0.D(packageName, obj2, true)) {
                    }
                }
                arrayList.add(obj3);
            }
            this.shown = arrayList;
            BaseAdapter baseAdapter = this.adapter;
            if (baseAdapter == null) {
                lw.E("adapter");
                throw null;
            }
            baseAdapter.notifyDataSetChanged();
        }

        private final void launch(Entry entry) {
            WorkbenchAppPicker workbenchAppPicker = WorkbenchAppPicker.INSTANCE;
            String unavailable = workbenchAppPicker.unavailable(this.coordinator, this.ctx);
            if (unavailable != null) {
                if (unavailable == null) {
                    unavailable = "添加状态无效";
                }
                z6.d(unavailable);
                return;
            }
            Object invoke = this.coordinator.getClass().getMethod("getMultiRootTaskInfo", null).invoke(this.coordinator, null);
            if (workbenchAppPicker.field(invoke.getClass(), "taskId").getInt(invoke) != this.rootId || workbenchAppPicker.field(invoke.getClass(), "userId").getInt(invoke) != this.userId) {
                z6.l("工作台会话已改变");
                return;
            }
            ActivityInfo activityInfo = this.ctx.getPackageManager().getActivityInfo(entry.getComponent(), 0);
            activityInfo.getClass();
            if (!activityInfo.enabled || !activityInfo.exported || !activityInfo.applicationInfo.enabled) {
                z6.l("Failed requirement.");
                return;
            }
            Class<?> cls = Class.forName("android.window.WindowContainerTransaction", false, this.loader);
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            Class.forName("com.android.wm.shell.vivomultitask.utils.VivoMultiTaskHelper", false, this.loader).getMethod("startComponent", cls, Context.class, invoke.getClass(), ComponentName.class, Boolean.TYPE).invoke(null, newInstance, this.ctx, invoke, entry.getComponent(), Boolean.TRUE);
            Object obj = workbenchAppPicker.field(this.coordinator.getClass(), "mVivoMultiTaskTransitions").get(this.coordinator);
            Class<?> cls2 = Class.forName("com.android.wm.shell.transition.Transitions$TransitionHandler", false, this.loader);
            Class<?> cls3 = obj.getClass();
            Class cls4 = Integer.TYPE;
            Method declaredMethod = cls3.getDeclaredMethod("startAddTransition", cls4, cls, cls2, cls4, cls4);
            declaredMethod.setAccessible(true);
            Object invoke2 = declaredMethod.invoke(obj, 1, newInstance, this.coordinator, 1, 1);
            MLog.INSTANCE.i(WorkbenchAppPicker.TAG, "v1.0.28 添加 transition 已启动 component=" + entry.getComponent().flattenToShortString() + " root=" + this.rootId + " user=" + this.userId + " child=true token=" + invoke2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
        
            r3.add(r6);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [com.vivo.cnm.lico.a] */
        /* JADX WARN: Type inference failed for: r4v8, types: [com.vivo.cnm.lico.WorkbenchAppPicker$Entry] */
        /* JADX WARN: Type inference failed for: r8v5, types: [qf0] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void show$lambda$20(final Session session) {
            Object qf0Var;
            ActivityInfo activityInfo;
            Drawable qf0Var2;
            int i = 0;
            try {
                List<ResolveInfo> queryIntentActivities = session.ctx.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), 0);
                queryIntentActivities.getClass();
                final Collator collator = Collator.getInstance();
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Drawable drawable = null;
                    if (!session.closed.get() && (activityInfo = resolveInfo.activityInfo) != null && activityInfo.enabled && activityInfo.exported && activityInfo.applicationInfo.enabled) {
                        ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                        String obj = resolveInfo.loadLabel(session.ctx.getPackageManager()).toString();
                        try {
                            qf0Var2 = resolveInfo.loadIcon(session.ctx.getPackageManager());
                        } catch (Throwable th) {
                            qf0Var2 = new qf0(th);
                        }
                        if (!(qf0Var2 instanceof qf0)) {
                            drawable = qf0Var2;
                        }
                        drawable = new Entry(componentName, obj, drawable);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (hashSet.add(((Entry) obj2).getComponent())) {
                        arrayList2.add(obj2);
                    }
                }
                final ?? r1 = new tq() { // from class: com.vivo.cnm.lico.a
                    @Override // defpackage.tq
                    public final Object invoke(Object obj3, Object obj4) {
                        int show$lambda$20$lambda$17$lambda$14;
                        show$lambda$20$lambda$17$lambda$14 = WorkbenchAppPicker.Session.show$lambda$20$lambda$17$lambda$14(collator, (WorkbenchAppPicker.Entry) obj3, (WorkbenchAppPicker.Entry) obj4);
                        return Integer.valueOf(show$lambda$20$lambda$17$lambda$14);
                    }
                };
                final List i0 = ac.i0(arrayList2, new Comparator() { // from class: com.vivo.cnm.lico.b
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        int show$lambda$20$lambda$17$lambda$15;
                        show$lambda$20$lambda$17$lambda$15 = WorkbenchAppPicker.Session.show$lambda$20$lambda$17$lambda$15(a.this, obj3, obj4);
                        return show$lambda$20$lambda$17$lambda$15;
                    }
                });
                qf0Var = Boolean.valueOf(WorkbenchAppPicker.main.post(new Runnable() { // from class: com.vivo.cnm.lico.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        WorkbenchAppPicker.Session.show$lambda$20$lambda$17$lambda$16(WorkbenchAppPicker.Session.this, i0);
                    }
                }));
            } catch (Throwable th2) {
                qf0Var = new qf0(th2);
            }
            Throwable a = rf0.a(qf0Var);
            if (a != null) {
                MLog.INSTANCE.e(WorkbenchAppPicker.TAG, "读取可启动应用失败", a);
                WorkbenchAppPicker.main.post(new d(session, i));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int show$lambda$20$lambda$17$lambda$14(Collator collator, Entry entry, Entry entry2) {
            return collator.compare(entry.getLabel(), entry2.getLabel());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int show$lambda$20$lambda$17$lambda$15(tq tqVar, Object obj, Object obj2) {
            return ((Number) tqVar.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void show$lambda$20$lambda$17$lambda$16(Session session, List list) {
            if (session.closed.get()) {
                return;
            }
            session.entries = list;
            TextView textView = session.empty;
            if (textView == null) {
                lw.E("empty");
                throw null;
            }
            textView.setText("没有匹配的应用");
            session.filter();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void show$lambda$20$lambda$19$lambda$18(Session session) {
            if (session.closed.get()) {
                return;
            }
            TextView textView = session.empty;
            if (textView != null) {
                textView.setText("读取失败，请关闭后重试");
            } else {
                lw.E("empty");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void show$lambda$9(final Session session, AdapterView adapterView, View view, int i, long j) {
            final Entry entry;
            if (session.selected || session.closed.get() || (entry = (Entry) ac.b0(i, session.shown)) == null) {
                return;
            }
            WorkbenchAppPicker workbenchAppPicker = WorkbenchAppPicker.INSTANCE;
            String unavailable = workbenchAppPicker.unavailable(session.coordinator, session.ctx);
            if (unavailable != null) {
                Toast.makeText(session.ctx, unavailable, 0).show();
                return;
            }
            session.selected = true;
            Object obj = workbenchAppPicker.field(session.model.getClass(), "mMainExecutor").get(session.model);
            obj.getClass();
            final long j2 = WorkbenchAppPicker.generation.get();
            ((Executor) obj).execute(new Runnable() { // from class: com.vivo.cnm.lico.e
                @Override // java.lang.Runnable
                public final void run() {
                    WorkbenchAppPicker.Session.show$lambda$9$lambda$8(WorkbenchAppPicker.Session.this, j2, entry);
                }
            });
            session.close();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void show$lambda$9$lambda$8(Session session, long j, Entry entry) {
            Object qf0Var;
            try {
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            if (j != WorkbenchAppPicker.generation.get()) {
                throw new IllegalArgumentException("工作台状态已改变，取消添加");
            }
            session.launch(entry);
            qf0Var = fs0.a;
            Throwable a = rf0.a(qf0Var);
            if (a != null) {
                MLog.INSTANCE.e(WorkbenchAppPicker.TAG, "添加应用事务失败 component=" + entry.getComponent().flattenToShortString(), a);
                WorkbenchAppPicker.main.post(new d(session, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void show$lambda$9$lambda$8$lambda$7$lambda$6(Session session) {
            Toast.makeText(session.ctx, "添加失败，请查看模块日志", 1).show();
        }

        public final void close() {
            if (this.closed.compareAndSet(false, true)) {
                this.worker.shutdownNow();
                if (this.receiverRegistered) {
                    try {
                        this.ctx.unregisterReceiver(this.screenReceiver);
                    } catch (Throwable unused) {
                    }
                    this.receiverRegistered = false;
                }
                AlertDialog alertDialog = this.dialog;
                if (alertDialog != null && alertDialog.isShowing()) {
                    alertDialog.dismiss();
                }
                this.dialog = null;
                if (WorkbenchAppPicker.active == this) {
                    WorkbenchAppPicker.active = null;
                }
            }
        }

        public final AtomicBoolean getClosed() {
            return this.closed;
        }

        public final Object getCoordinator() {
            return this.coordinator;
        }

        public final Context getCtx() {
            return this.ctx;
        }

        public final ClassLoader getLoader() {
            return this.loader;
        }

        public final Object getModel() {
            return this.model;
        }

        public final int getRootId() {
            return this.rootId;
        }

        public final int getUserId() {
            return this.userId;
        }

        public final void show() {
            this.ctx.registerReceiver(this.screenReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"), 4);
            this.receiverRegistered = true;
            LinearLayout linearLayout = new LinearLayout(this.themed);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(dp(12), dp(4), dp(12), dp(8));
            EditText editText = new EditText(this.themed);
            editText.setSingleLine(true);
            editText.setHint("搜索应用");
            this.search = editText;
            linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
            ListView listView = new ListView(this.themed);
            listView.setDividerHeight(0);
            TextView textView = new TextView(this.themed);
            textView.setText("正在读取应用");
            textView.setGravity(17);
            this.empty = textView;
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, dp(48)));
            int dp = dp(460);
            int dp2 = this.ctx.getResources().getDisplayMetrics().heightPixels - dp(48);
            if (dp2 < 1) {
                dp2 = 1;
            }
            int min = Math.min(dp, dp2);
            int dp3 = min - dp(176);
            int dp4 = dp(80);
            if (dp3 < dp4) {
                dp3 = dp4;
            }
            linearLayout.addView(listView, new LinearLayout.LayoutParams(-1, dp3));
            TextView textView2 = this.empty;
            if (textView2 == null) {
                lw.E("empty");
                throw null;
            }
            listView.setEmptyView(textView2);
            BaseAdapter baseAdapter = new BaseAdapter() { // from class: com.vivo.cnm.lico.WorkbenchAppPicker$Session$show$3
                @Override // android.widget.Adapter
                public int getCount() {
                    List list;
                    list = WorkbenchAppPicker.Session.this.shown;
                    return list.size();
                }

                @Override // android.widget.Adapter
                public WorkbenchAppPicker.Entry getItem(int i) {
                    List list;
                    list = WorkbenchAppPicker.Session.this.shown;
                    return (WorkbenchAppPicker.Entry) list.get(i);
                }

                @Override // android.widget.Adapter
                public long getItemId(int i) {
                    return i;
                }

                @Override // android.widget.Adapter
                public View getView(int i, View view, ViewGroup viewGroup) {
                    List list;
                    ContextThemeWrapper contextThemeWrapper;
                    int dp5;
                    int dp6;
                    int dp7;
                    int dp8;
                    ContextThemeWrapper contextThemeWrapper2;
                    int dp9;
                    int dp10;
                    ContextThemeWrapper contextThemeWrapper3;
                    int dp11;
                    LinearLayout linearLayout2 = view instanceof LinearLayout ? (LinearLayout) view : null;
                    if (linearLayout2 == null) {
                        contextThemeWrapper = WorkbenchAppPicker.Session.this.themed;
                        linearLayout2 = new LinearLayout(contextThemeWrapper);
                        WorkbenchAppPicker.Session session = WorkbenchAppPicker.Session.this;
                        linearLayout2.setGravity(16);
                        dp5 = session.dp(8);
                        dp6 = session.dp(8);
                        dp7 = session.dp(8);
                        dp8 = session.dp(8);
                        linearLayout2.setPadding(dp5, dp6, dp7, dp8);
                        contextThemeWrapper2 = session.themed;
                        ImageView imageView = new ImageView(contextThemeWrapper2);
                        dp9 = session.dp(36);
                        dp10 = session.dp(36);
                        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(dp9, dp10));
                        contextThemeWrapper3 = session.themed;
                        TextView textView3 = new TextView(contextThemeWrapper3);
                        textView3.setTextSize(15.0f);
                        dp11 = session.dp(12);
                        textView3.setPadding(dp11, 0, 0, 0);
                        textView3.setMaxLines(2);
                        linearLayout2.addView(textView3, new LinearLayout.LayoutParams(0, -2, 1.0f));
                    }
                    list = WorkbenchAppPicker.Session.this.shown;
                    WorkbenchAppPicker.Entry entry = (WorkbenchAppPicker.Entry) list.get(i);
                    View childAt = linearLayout2.getChildAt(0);
                    childAt.getClass();
                    ((ImageView) childAt).setImageDrawable(entry.getIcon());
                    View childAt2 = linearLayout2.getChildAt(1);
                    childAt2.getClass();
                    ((TextView) childAt2).setText(entry.getLabel());
                    linearLayout2.setContentDescription(entry.getLabel());
                    return linearLayout2;
                }
            };
            this.adapter = baseAdapter;
            listView.setAdapter((ListAdapter) baseAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.vivo.cnm.lico.f
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    WorkbenchAppPicker.Session.show$lambda$9(WorkbenchAppPicker.Session.this, adapterView, view, i, j);
                }
            });
            EditText editText2 = this.search;
            if (editText2 == null) {
                lw.E("search");
                throw null;
            }
            editText2.addTextChangedListener(new TextWatcher() { // from class: com.vivo.cnm.lico.WorkbenchAppPicker$Session$show$5
                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    WorkbenchAppPicker.Session.this.filter();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            AlertDialog create = new AlertDialog.Builder(this.themed).setTitle("添加应用").setView(linearLayout).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
            this.dialog = create;
            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vivo.cnm.lico.g
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    WorkbenchAppPicker.Session.this.close();
                }
            });
            Window window = create.getWindow();
            if (window != null) {
                window.setType(2008);
            }
            Window window2 = create.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(16);
            }
            create.show();
            int dp5 = this.ctx.getResources().getDisplayMetrics().widthPixels - dp(32);
            int min2 = Math.min(dp5 >= 1 ? dp5 : 1, dp(400));
            Window window3 = create.getWindow();
            if (window3 != null) {
                window3.setLayout(min2, min);
            }
            this.worker.execute(new d(this, 2));
        }
    }

    private WorkbenchAppPicker() {
    }

    private final void closeFor(Object obj) {
        generation.incrementAndGet();
        onMain(new ze(2, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 closeFor$lambda$12(Object obj) {
        Session session;
        Session session2 = active;
        if ((session2 != null ? session2.getModel() : null) == obj && (session = active) != null) {
            session.close();
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Field field(Class<?> cls, String str) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException(j2.j(cls.getName(), ".", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 install$lambda$11(XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Method method : declaredMethods) {
            if (m20.m("reset", "onExitVivoMultiTaskFinished", "onDisplayConfigurationChanged").contains(method.getName())) {
                arrayList.add(method);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Method method2 = (Method) obj;
            method2.setAccessible(true);
            xposedModule.hook(method2).setId("wb_phone_picker_coord_close_" + method2.getName()).intercept(new mr(8));
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$11$lambda$10(XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        generation.incrementAndGet();
        INSTANCE.onMain(new ze(1, thisObject));
        return chain.proceed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 install$lambda$11$lambda$10$lambda$9(Object obj) {
        Session session;
        Session session2 = active;
        if ((session2 != null ? session2.getCoordinator() : null) == obj && (session = active) != null) {
            session.close();
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 install$lambda$7(ClassLoader classLoader, XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        try {
            Class cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("startLauncherSubWindow", cls2, cls2, cls2);
            declaredMethod.setAccessible(true);
            xposedModule.hook(declaredMethod).setId("wb_phone_missing_launcher_picker").intercept(new vb0(cls, classLoader, 1));
            for (String str : kw.C("releaseAppWindowUi", "onUserSwitched", "onDisplayChange")) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Method method : declaredMethods) {
                    if (lw.i(method.getName(), str)) {
                        arrayList.add(method);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Method method2 = (Method) obj;
                    method2.setAccessible(true);
                    xposedModule.hook(method2).setId("wb_phone_picker_close_" + str).intercept(new mr(7));
                }
            }
            MLog.INSTANCE.i(TAG, "v1.0.28 已挂缺失桌面服务的添加应用替代入口");
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "添加应用替代入口安装失败", th);
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r4 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object install$lambda$7$lambda$4(Class cls, final ClassLoader classLoader, XposedInterface.Chain chain) {
        boolean z;
        Object qf0Var;
        chain.getClass();
        final Object thisObject = chain.getThisObject();
        WorkbenchAppPicker workbenchAppPicker = INSTANCE;
        if (thisObject != null) {
            try {
                Object obj = workbenchAppPicker.field(cls, "mContext").get(thisObject);
                obj.getClass();
                z = true;
                boolean z2 = ((Context) obj).getPackageManager().resolveService(new Intent().setComponent(new ComponentName(lw.i(Class.forName("com.vivo.multitask.VivoMultiTaskConstants", false, classLoader).getMethod("isFos15", null).invoke(null, null), Boolean.TRUE) ? "com.android.launcher3" : "com.bbk.launcher2", "com.bbk.launcher2.subwindow.LauncherSubWindowService")), 0) != null;
                if (workbenchAppPicker.field(cls, "mLauncherService").get(thisObject) == null) {
                }
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
        }
        z = false;
        qf0Var = Boolean.valueOf(z);
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "添加服务检测失败，回退原生", a);
        }
        Boolean bool = Boolean.FALSE;
        if (qf0Var instanceof qf0) {
            qf0Var = bool;
        }
        if (!((Boolean) qf0Var).booleanValue() || thisObject == null) {
            return chain.proceed();
        }
        WorkbenchAppPicker workbenchAppPicker2 = INSTANCE;
        workbenchAppPicker2.field(cls, "isTaskButtonClick").setBoolean(thisObject, false);
        workbenchAppPicker2.field(cls, "isMainTaskBarClick").setBoolean(thisObject, false);
        MLog.INSTANCE.i(TAG, "v1.0.28 添加入口命中，桌面子窗口服务缺失，打开应用选择器");
        final long j = generation.get();
        main.post(new Runnable() { // from class: ww0
            @Override // java.lang.Runnable
            public final void run() {
                WorkbenchAppPicker.install$lambda$7$lambda$4$lambda$3(j, thisObject, classLoader);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$7$lambda$4$lambda$3(long j, Object obj, ClassLoader classLoader) {
        if (j == generation.get()) {
            INSTANCE.open(obj, classLoader, "subwindow");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$7$lambda$6(XposedInterface.Chain chain) {
        chain.getClass();
        INSTANCE.closeFor(chain.getThisObject());
        return chain.proceed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMain(eq eqVar) {
        if (lw.i(Looper.myLooper(), Looper.getMainLooper())) {
            eqVar.b();
        } else {
            main.post(new u2(eqVar, 4));
        }
    }

    private final void open(Object obj, ClassLoader classLoader, String str) {
        Object qf0Var;
        Object invoke;
        Session session;
        AtomicBoolean closed;
        if (!lw.i(Looper.myLooper(), Looper.getMainLooper())) {
            z6.m("Check failed.");
            return;
        }
        Session session2 = active;
        if ((session2 != null ? session2.getModel() : null) != obj || (session = active) == null || (closed = session.getClosed()) == null || closed.get()) {
            Session session3 = active;
            if (session3 != null) {
                session3.close();
            }
            try {
                invoke = obj.getClass().getMethod("getVivoMultiTaskCoordinator", null).invoke(obj, null);
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            if (invoke == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object obj2 = field(obj.getClass(), "mContext").get(obj);
            obj2.getClass();
            Context context = (Context) obj2;
            String unavailable = unavailable(invoke, context);
            if (unavailable != null) {
                Toast.makeText(context, unavailable, 0).show();
                MLog.INSTANCE.w(TAG, "添加入口拒绝：".concat(unavailable));
                return;
            }
            Object invoke2 = invoke.getClass().getMethod("getMultiRootTaskInfo", null).invoke(invoke, null);
            int i = field(invoke2.getClass(), "taskId").getInt(invoke2);
            int i2 = field(invoke2.getClass(), "userId").getInt(invoke2);
            Class<?> cls = Class.forName("android.os.UserHandle");
            Class cls2 = Integer.TYPE;
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2);
            declaredConstructor.setAccessible(true);
            Object invoke3 = Context.class.getMethod("createContextAsUser", cls, cls2).invoke(context, declaredConstructor.newInstance(Integer.valueOf(i2)), 0);
            invoke3.getClass();
            Session session4 = new Session(obj, invoke, (Context) invoke3, classLoader, i, i2);
            active = session4;
            session4.show();
            MLog.INSTANCE.i(TAG, "应用选择器已显示 root=" + i + " user=" + i2 + " source=" + str);
            qf0Var = fs0.a;
            Throwable a = rf0.a(qf0Var);
            if (a != null) {
                Session session5 = active;
                if (session5 != null) {
                    Session session6 = session5.getModel() == obj ? session5 : null;
                    if (session6 != null) {
                        session6.close();
                    }
                }
                MLog.INSTANCE.e(TAG, "打开应用选择器失败", a);
                try {
                    Object obj3 = INSTANCE.field(obj.getClass(), "mContext").get(obj);
                    obj3.getClass();
                    Toast.makeText((Context) obj3, "应用选择器打开失败，请查看模块日志", 1).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String unavailable(Object obj, Context context) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager != null && !powerManager.isInteractive()) {
            return "屏幕已关闭";
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
            return "请先解锁屏幕";
        }
        Class<?> cls = obj.getClass();
        if (!lw.i(cls.getMethod("isVivoMultiTaskActive", null).invoke(obj, null), Boolean.TRUE)) {
            return "工作台已退出";
        }
        List C = kw.C("isInPendingTransition", "isInPendingAddAnimation", "isInSwitchLayoutAnimation");
        if (!C.isEmpty()) {
            Iterator it = C.iterator();
            while (it.hasNext()) {
                if (lw.i(cls.getMethod((String) it.next(), null).invoke(obj, null), Boolean.TRUE)) {
                    return "请等待工作台动画完成";
                }
            }
        }
        Object invoke = cls.getMethod("getVivoMultiTaskStatesList", null).invoke(obj, null);
        invoke.getClass();
        if (((List) invoke).size() >= 5) {
            return "工作台最多容纳五个应用";
        }
        return null;
    }

    public final void install(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        ClassWatch classWatch = ClassWatch.INSTANCE;
        classWatch.watch(xposedModule, classLoader, UI, new dp(classLoader, 3));
        classWatch.watch(xposedModule, classLoader, "com.android.wm.shell.vivomultitask.VivoMultiTaskCoordinator", new ei0(22));
    }
}
