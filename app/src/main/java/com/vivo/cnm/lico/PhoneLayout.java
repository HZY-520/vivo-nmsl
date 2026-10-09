package com.vivo.cnm.lico;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import defpackage.bc;
import defpackage.z6;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class PhoneLayout {
    public static final int H_BOTTOM_MARGIN_LAND = 18;
    public static final int H_BOTTOM_MARGIN_PORT = 42;
    public static final int H_ITEM_HEIGHT_BASIS_LAND = 61;
    public static final float H_ITEM_HEIGHT_FACTOR_PORT = 6.5f;
    public static final int H_ITEM_TO_MAIN_LAND = 12;
    public static final int H_ITEM_TO_MAIN_PORT = 12;
    public static final int H_ITEM_WIDTH_BASIS_PORT = 74;
    public static final float H_ITEM_WIDTH_FACTOR_LAND = 5.32f;
    public static final int H_LEFT_MARGIN_PORT = 12;
    public static final int H_RIGHT_MARGIN_PORT = 12;
    public static final int H_TOP_MARGIN_LAND = 12;
    public static final int H_TOP_MARGIN_PORT = 50;
    public static final int V_BOTTOM_MARGIN_LAND = 18;
    public static final int V_ITEM_HEIGHT_BASIS_LAND = 74;
    public static final float V_ITEM_HEIGHT_FACTOR_PORT = 5.4f;
    public static final int V_ITEM_TO_MAIN_LAND = 12;
    public static final int V_ITEM_TO_MAIN_PORT = 12;
    public static final int V_ITEM_WIDTH_BASIS_PORT = 61;
    public static final float V_ITEM_WIDTH_FACTOR_LAND = 6.5f;
    public static final int V_LEFT_MARGIN_LAND = 50;
    public static final int V_LEFT_MARGIN_PORT = 12;
    public static final int V_MAIN_VERTICAL_PADDING = 50;
    public static final int V_RIGHT_MARGIN_LAND = 42;
    public static final int V_RIGHT_MARGIN_PORT = 12;
    public static final int V_TOP_MARGIN_LAND = 18;
    public static final PhoneLayout INSTANCE = new PhoneLayout();
    private static final float[] predefinedRatios = {1.3333334f, 1.5555556f, 1.7777778f, 2.3333333f};
    public static final int $stable = 8;

    private PhoneLayout() {
    }

    private final Point fitChildToStrip(Context context, Point point, boolean z, boolean z2, int i, int i2) {
        int displayWidth = ((z2 ? displayWidth(z, i, i2) : displayHeight(z, i, i2)) - (dp(context, 12.0f) * 2)) - (gap(context) * 3);
        if (displayWidth < 4) {
            displayWidth = 4;
        }
        float f = displayWidth / 4.0f;
        float f2 = z2 ? point.x : point.y;
        if (f2 <= f) {
            return new Point(point);
        }
        float f3 = f / f2;
        int i3 = (int) (point.x * f3);
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = (int) (point.y * f3);
        return new Point(i3, i4 >= 1 ? i4 : 1);
    }

    public static final Object toPointInfo(ClassLoader classLoader, Rect rect) {
        classLoader.getClass();
        rect.getClass();
        return toPointInfo(classLoader, new Point(rect.left, rect.top), new Point(rect.right, rect.top), new Point(rect.right, rect.bottom), new Point(rect.left, rect.bottom));
    }

    public final int childOffset(Context context, List<? extends Point> list, boolean z, boolean z2, int i, int i2, int i3) {
        list.getClass();
        if (i3 < 0 || list.size() > 4) {
            z6.l("Failed requirement.");
            return 0;
        }
        if (i3 > 0) {
            return gap(context);
        }
        Point normalChildSize = normalChildSize(context, z, z2, i, i2);
        ArrayList arrayList = new ArrayList(bc.V(list));
        for (Point point : list) {
            arrayList.add(Integer.valueOf(z2 ? point.x : point.y));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (list.size() < 4) {
            arrayList2.add(Integer.valueOf(z2 ? normalChildSize.x : normalChildSize.y));
        }
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            i4 += ((Number) obj).intValue();
        }
        return (int) ((((z2 ? displayWidth(z, i, i2) : displayHeight(z, i, i2)) - ((gap(context) * (arrayList2.size() - 1 >= 0 ? r12 : 0)) + i4)) / 2.0f) + 0.5f);
    }

    public final ArrayList<Object> childPointInfos(ClassLoader classLoader, Context context, List<? extends Point> list, boolean z, boolean z2, int i, int i2) {
        classLoader.getClass();
        list.getClass();
        List<Point[]> childQuads = childQuads(context, list, z, z2, i, i2);
        ArrayList arrayList = new ArrayList(bc.V(childQuads));
        for (Point[] pointArr : childQuads) {
            arrayList.add(toPointInfo(classLoader, pointArr[0], pointArr[1], pointArr[2], pointArr[3]));
        }
        return new ArrayList<>(arrayList);
    }

    public final List<Point[]> childQuads(Context context, List<? extends Point> list, boolean z, boolean z2, int i, int i2) {
        int i3;
        char c;
        PhoneLayout phoneLayout;
        Point[] pointArr;
        list.getClass();
        if (i > 0 && i2 > 0) {
            int i4 = 4;
            if (list.size() <= 4) {
                if (!list.isEmpty()) {
                    for (Point point : list) {
                        if (point.x > 0 && point.y > 0) {
                        }
                    }
                }
                Point normalChildSize = normalChildSize(context, z, z2, i, i2);
                ArrayList arrayList = new ArrayList(list);
                if (list.size() < 4) {
                    arrayList.add(normalChildSize);
                }
                boolean z3 = z2;
                int childOffset = childOffset(context, list, z, z3, i, i2, 0);
                float perspectiveRatio = perspectiveRatio(context, z, z3, z3 ? normalChildSize.y : normalChildSize.x);
                char c2 = 2;
                int displayWidth = (z3 ? displayWidth(z, i, i2) : displayHeight(z, i, i2)) / 2;
                ArrayList arrayList2 = new ArrayList(bc.V(arrayList));
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    Point point2 = (Point) obj;
                    if (z3) {
                        c = c2;
                        phoneLayout = INSTANCE;
                        int horizontalTopMargin = phoneLayout.horizontalTopMargin(context, z);
                        int i6 = (int) (((1.0f - perspectiveRatio) * (displayWidth - childOffset)) + childOffset);
                        pointArr = new Point[i4];
                        pointArr[0] = new Point(childOffset, horizontalTopMargin);
                        i3 = displayWidth;
                        pointArr[1] = new Point(point2.x + childOffset, horizontalTopMargin);
                        pointArr[c] = new Point((int) ((point2.x * perspectiveRatio) + i6), point2.y + horizontalTopMargin);
                        pointArr[3] = new Point(i6, horizontalTopMargin + point2.y);
                    } else {
                        i3 = displayWidth;
                        c = c2;
                        phoneLayout = INSTANCE;
                        int verticalLeftOffset = phoneLayout.verticalLeftOffset(context, z);
                        int i7 = (int) (((1.0f - perspectiveRatio) * (i3 - childOffset)) + childOffset);
                        pointArr = new Point[4];
                        pointArr[0] = new Point(verticalLeftOffset, childOffset);
                        pointArr[1] = new Point(point2.x + verticalLeftOffset, i7);
                        pointArr[c] = new Point(point2.x + verticalLeftOffset, (int) ((point2.y * perspectiveRatio) + i7));
                        pointArr[3] = new Point(verticalLeftOffset, point2.y + childOffset);
                    }
                    childOffset += phoneLayout.gap(context) + (z2 ? point2.x : point2.y);
                    arrayList2.add(pointArr);
                    c2 = c;
                    z3 = z2;
                    displayWidth = i3;
                    i4 = 4;
                }
                return arrayList2;
            }
        }
        z6.l("Failed requirement.");
        return null;
    }

    public final Point childSize(Context context, boolean z, boolean z2, int i, int i2, boolean z3, float f, float f2) {
        float min;
        float f3;
        Point normalChildSize = normalChildSize(context, z, z2, i, i2);
        if (!z3) {
            f = f2;
        }
        if (Math.abs(f) > Float.MAX_VALUE || f <= 0.0f) {
            z6.l("Failed requirement.");
            return null;
        }
        if (z3) {
            min = Math.min(normalChildSize.x, normalChildSize.y / f);
            f3 = f * min;
        } else {
            min = Math.min(normalChildSize.x, normalChildSize.y * f);
            f3 = min / f;
        }
        int i3 = (int) min;
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = (int) f3;
        Point point = new Point(i3, i4 >= 1 ? i4 : 1);
        if (point.x > 0 && point.y > 0) {
            return fitChildToStrip(context, point, z, z2, i, i2);
        }
        z6.l("Failed requirement.");
        return null;
    }

    public final Rect computeMainTaskRect(Rect rect, Rect rect2) {
        if (rect == null || rect2 == null) {
            return rect;
        }
        if (rect.width() <= 0 || rect.height() <= 0) {
            z6.l("Failed requirement.");
            return null;
        }
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            z6.l("Failed requirement.");
            return null;
        }
        float min = Math.min(rect.width() / rect2.width(), rect.height() / rect2.height());
        int width = (int) (rect2.width() * min);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (rect2.height() * min);
        int i = height >= 1 ? height : 1;
        int width2 = ((rect.width() - width) / 2) + rect.left;
        int height2 = ((rect.height() - i) / 2) + rect.top;
        return new Rect(width2, height2, width + width2, i + height2);
    }

    public final int displayHeight(boolean z, int i, int i2) {
        return z ? Math.max(i, i2) : Math.min(i, i2);
    }

    public final int displayWidth(boolean z, int i, int i2) {
        return z ? Math.min(i, i2) : Math.max(i, i2);
    }

    public final int dp(Context context, float f) {
        Resources resources;
        DisplayMetrics displayMetrics = (context == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics();
        Integer valueOf = displayMetrics != null ? Integer.valueOf(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)) : null;
        return (int) ((f * ((valueOf != null && valueOf.intValue() == 1440) ? 4.0f : ((valueOf != null && valueOf.intValue() == 1080) || (valueOf != null && valueOf.intValue() == 1134)) ? 3.0f : ((valueOf != null && valueOf.intValue() == 1260) || displayMetrics == null) ? 3.5f : displayMetrics.density)) + 0.5f);
    }

    public final int gap(Context context) {
        return dp(context, 13.0f);
    }

    public final int horizontalRecyclerviewSurfaceHeight(Context context, boolean z, int i, int i2) {
        return dp(context, 12.0f) + topBottomItemNormalHeight(context, z, i, i2) + horizontalTopMargin(context, z);
    }

    public final int horizontalTopMargin(Context context, boolean z) {
        return dp(context, z ? 50.0f : 12.0f);
    }

    public final Rect mainTaskRect(Context context, boolean z, boolean z2, int i, int i2, Rect rect) {
        rect.getClass();
        Rect maxAvailableRectTopBottom = z2 ? maxAvailableRectTopBottom(context, z, i, i2) : maxAvailableRectLeftRight(context, z, i, i2);
        if (z2) {
            Rect computeMainTaskRect = computeMainTaskRect(maxAvailableRectTopBottom, rect);
            if (computeMainTaskRect != null) {
                return computeMainTaskRect;
            }
            z6.l("Required value was null.");
            return null;
        }
        Rect computeMainTaskRect2 = computeMainTaskRect(maxAvailableRectTopBottom, rect);
        if (computeMainTaskRect2 == null) {
            z6.l("Required value was null.");
            return null;
        }
        if (!z) {
            int width = computeMainTaskRect2.width();
            int i3 = maxAvailableRectTopBottom.left;
            computeMainTaskRect2.left = i3;
            computeMainTaskRect2.right = i3 + width;
        }
        return computeMainTaskRect2;
    }

    public final Rect maxAvailableRectLeftRight(Context context, boolean z, int i, int i2) {
        int displayWidth = displayWidth(z, i, i2);
        int displayHeight = displayHeight(z, i, i2);
        if (z) {
            return new Rect(dp(context, 85.0f), dp(context, 50.0f), displayWidth - dp(context, 12.0f), displayHeight - dp(context, 50.0f));
        }
        return new Rect(dp(context, 12.0f) + verticalNormalItemWidth(context, false, i, i2) + dp(context, 50.0f), dp(context, 18.0f), displayWidth - dp(context, 42.0f), displayHeight - dp(context, 18.0f));
    }

    public final Rect maxAvailableRectTopBottom(Context context, boolean z, int i, int i2) {
        int displayWidth = displayWidth(z, i, i2);
        int displayHeight = displayHeight(z, i, i2);
        int horizontalRecyclerviewSurfaceHeight = horizontalRecyclerviewSurfaceHeight(context, z, i, i2);
        return z ? new Rect(0, horizontalRecyclerviewSurfaceHeight, displayWidth, displayHeight - dp(context, 42.0f)) : new Rect(0, horizontalRecyclerviewSurfaceHeight, displayWidth, displayHeight - dp(context, 18.0f));
    }

    public final Point normalChildSize(Context context, boolean z, boolean z2, int i, int i2) {
        return fitChildToStrip(context, z2 ? new Point(topBottomItemNormalWidth(context, z, i, i2), topBottomItemNormalHeight(context, z, i, i2)) : new Point(verticalNormalItemWidth(context, z, i, i2), verticalNormalItemHeight(context, z, i, i2)), z, z2, i, i2);
    }

    public final float perspectiveRatio(Context context, boolean z, boolean z2, int i) {
        if (!z2 && !z) {
            return 1.0f;
        }
        if (z2) {
            z = !z;
        }
        int dp = dp(context, z ? 512.0f : 3215.0f);
        if (i > 0 && i < dp) {
            return (dp - i) / dp;
        }
        z6.l("Failed requirement.");
        return 0.0f;
    }

    public final float safeTaskRatio(Rect rect, boolean z, float f) {
        float width;
        int height;
        rect.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE && f > 0.0f) {
            return f;
        }
        if (rect.width() > 0 && rect.height() > 0) {
            if (z) {
                width = rect.height();
                height = rect.width();
            } else {
                width = rect.width();
                height = rect.height();
            }
            float f2 = width / height;
            if (Math.abs(f2) <= Float.MAX_VALUE && f2 > 0.0f) {
                return f2;
            }
        }
        return 1.0f;
    }

    public final int topBottomItemNormalHeight(Context context, boolean z, int i, int i2) {
        return z ? (int) ((displayHeight(true, i, i2) - dp(context, 104.0f)) / 6.5f) : dp(context, 61.0f);
    }

    public final int topBottomItemNormalWidth(Context context, boolean z, int i, int i2) {
        return z ? dp(context, 74.0f) : (int) (displayWidth(false, i, i2) / 5.32f);
    }

    public final int verticalLeftOffset(Context context, boolean z) {
        return dp(context, z ? 12.0f : 50.0f);
    }

    public final int verticalNormalItemHeight(Context context, boolean z, int i, int i2) {
        return z ? (int) (displayHeight(true, i, i2) / 5.4f) : dp(context, 74.0f);
    }

    public final int verticalNormalItemWidth(Context context, boolean z, int i, int i2) {
        return z ? dp(context, 61.0f) : (int) ((displayWidth(false, i, i2) - dp(context, 104.0f)) / 6.5f);
    }

    public final int verticalRecyclerviewWidth(Context context, boolean z, int i, int i2) {
        return dp(context, 12.0f) + verticalNormalItemWidth(context, z, i, i2) + verticalLeftOffset(context, z);
    }

    public static final Object toPointInfo(ClassLoader classLoader, Point point, Point point2, Point point3, Point point4) {
        classLoader.getClass();
        point.getClass();
        point2.getClass();
        point3.getClass();
        point4.getClass();
        Object newInstance = Class.forName("com.android.wm.shell.vivomultitask.vivomultitaskui.VivoMultiTaskPointInfo", false, classLoader).getConstructor(Point.class, Point.class, Point.class, Point.class).newInstance(point, point2, point3, point4);
        newInstance.getClass();
        return newInstance;
    }
}
