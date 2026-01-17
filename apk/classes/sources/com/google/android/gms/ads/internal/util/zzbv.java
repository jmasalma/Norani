package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzfca;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfwe;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbv {
    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzk = zzk(view);
        return new Point(((int) motionEvent.getRawX()) - zzk[0], ((int) motionEvent.getRawY()) - zzk[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) zzbd.zzc().zzb(zzbde.zziu)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", zzbb.zzb().zzb(context, point2.x));
                    jSONObject3.put("y", zzbb.zzb().zzb(context, point2.y));
                    jSONObject3.put("start_x", zzbb.zzb().zzb(context, point.x));
                    jSONObject3.put("start_y", zzbb.zzb().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    int i = zze.zza;
                    zzo.zzh("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                int i2 = zze.zza;
                zzo.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
            int i22 = zze.zza;
            zzo.zzh("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Context context2 = context;
        Map map3 = map2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (!(map == null || view == null)) {
            int[] zzk = zzk(view);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] zzk2 = zzk(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", zzbb.zzb().zzb(context2, view2.getMeasuredWidth()));
                            jSONObject5.put("height", zzbb.zzb().zzb(context2, view2.getMeasuredHeight()));
                            jSONObject5.put("x", zzbb.zzb().zzb(context2, zzk2[0] - zzk[0]));
                            jSONObject5.put("y", zzbb.zzb().zzb(context2, zzk2[1] - zzk[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = zzl(context2, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", zzbb.zzb().zzb(context2, zzk2[0] - zzk[0]));
                                jSONObject2.put("y", zzbb.zzb().zzb(context2, zzk2[1] - zzk[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) zzbd.zzc().zzb(zzbde.zzio)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) zzbd.zzc().zzb(zzbde.zzip)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                                if (((Boolean) zzbd.zzc().zzb(zzbde.zziq)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str2 = str3;
                                str = str4;
                                try {
                                    jSONObject4.put("font_size", (double) textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    int i = zze.zza;
                                    zzo.zzj("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str2;
                                    str4 = str;
                                }
                            } else {
                                str2 = str3;
                                str = str4;
                            }
                            jSONObject4.put("is_clickable", map3 != null && map3.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) zzbd.zzc().zzb(zzbde.zzir)).booleanValue()) {
                                jSONObject4.put("alpha", (double) view2.getAlpha());
                            }
                            jSONObject = jSONObject6;
                            try {
                                jSONObject.put((String) entry.getKey(), jSONObject4);
                            } catch (JSONException unused2) {
                            }
                        } catch (JSONException unused3) {
                            str2 = str3;
                            str = str4;
                            jSONObject = jSONObject6;
                            int i2 = zze.zza;
                            zzo.zzj("Unable to get asset views information");
                            it = it2;
                            jSONObject3 = jSONObject;
                            str3 = str2;
                            str4 = str;
                        }
                    } catch (JSONException unused4) {
                        str2 = str3;
                        str = str4;
                        jSONObject = jSONObject3;
                        int i22 = zze.zza;
                        zzo.zzj("Unable to get asset views information");
                        it = it2;
                        jSONObject3 = jSONObject;
                        str3 = str2;
                        str4 = str;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str2;
                    str4 = str;
                }
            }
        }
        return jSONObject3;
    }

    public static JSONObject zze(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                zzv.zzr();
                jSONObject.put("can_show_on_lock_screen", zzs.zzo(view));
                zzv.zzr();
                jSONObject.put("is_keyguard_locked", zzs.zzE(context));
            } catch (JSONException unused) {
                int i = zze.zza;
                zzo.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zzf(@Nonnull Context context) {
        JSONObject jSONObject = new JSONObject();
        zzv.zzr();
        DisplayMetrics zzu = zzs.zzu((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", zzbb.zzb().zzb(context, zzu.widthPixels));
            jSONObject.put("height", zzbb.zzb().zzb(context, zzu.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject zzg(View view) {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z = false;
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzin)).booleanValue()) {
                    zzv.zzr();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent != null) {
                        z = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                } else {
                    zzv.zzr();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if (parent2 == null) {
                        i = -1;
                    } else {
                        i = ((AdapterView) parent2).getPositionForView(view);
                    }
                    if (i != -1) {
                        z = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0163 A[Catch:{ JSONException -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0182 A[SYNTHETIC, Splitter:B:49:0x0182] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject zzh(android.content.Context r16, android.view.View r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "window"
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "height"
            java.lang.String r7 = "width"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r1 != 0) goto L_0x0019
            goto L_0x01c9
        L_0x0019:
            r9 = 2
            r10 = 1
            r11 = 0
            int[] r12 = zzk(r17)     // Catch:{ Exception -> 0x00fe }
            int[] r13 = new int[r9]     // Catch:{ Exception -> 0x00fe }
            int r14 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00fe }
            r13[r11] = r14     // Catch:{ Exception -> 0x00fe }
            int r14 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00fe }
            r13[r10] = r14     // Catch:{ Exception -> 0x00fe }
            android.view.ViewParent r14 = r17.getParent()     // Catch:{ Exception -> 0x00fe }
        L_0x0032:
            boolean r15 = r14 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x00fe }
            if (r15 == 0) goto L_0x0059
            r15 = r14
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ Exception -> 0x00fe }
            int r9 = r15.getMeasuredWidth()     // Catch:{ Exception -> 0x00fe }
            r10 = r13[r11]     // Catch:{ Exception -> 0x00fe }
            int r9 = java.lang.Math.min(r9, r10)     // Catch:{ Exception -> 0x00fe }
            r13[r11] = r9     // Catch:{ Exception -> 0x00fe }
            int r9 = r15.getMeasuredHeight()     // Catch:{ Exception -> 0x00fe }
            r10 = 1
            r15 = r13[r10]     // Catch:{ Exception -> 0x00fe }
            int r9 = java.lang.Math.min(r9, r15)     // Catch:{ Exception -> 0x00fe }
            r13[r10] = r9     // Catch:{ Exception -> 0x00fe }
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00fe }
            r9 = 2
            r10 = 1
            goto L_0x0032
        L_0x0059:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fe }
            r9.<init>()     // Catch:{ Exception -> 0x00fe }
            int r10 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r10 = r14.zzb(r0, r10)     // Catch:{ Exception -> 0x00fe }
            r9.put(r7, r10)     // Catch:{ Exception -> 0x00fe }
            int r10 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r10 = r14.zzb(r0, r10)     // Catch:{ Exception -> 0x00fe }
            r9.put(r6, r10)     // Catch:{ Exception -> 0x00fe }
            r10 = r12[r11]     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r10 = r14.zzb(r0, r10)     // Catch:{ Exception -> 0x00fe }
            r9.put(r5, r10)     // Catch:{ Exception -> 0x00fe }
            r10 = 1
            r14 = r12[r10]     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r10 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r10 = r10.zzb(r0, r14)     // Catch:{ Exception -> 0x00fe }
            r9.put(r4, r10)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r10 = "maximum_visible_width"
            r14 = r13[r11]     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r15 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r14 = r15.zzb(r0, r14)     // Catch:{ Exception -> 0x00fe }
            r9.put(r10, r14)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r10 = "maximum_visible_height"
            r14 = 1
            r13 = r13[r14]     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r14 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r13 = r14.zzb(r0, r13)     // Catch:{ Exception -> 0x00fe }
            r9.put(r10, r13)     // Catch:{ Exception -> 0x00fe }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r10 = "frame"
            r8.put(r10, r9)     // Catch:{ Exception -> 0x00fe }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ Exception -> 0x00fe }
            r9.<init>()     // Catch:{ Exception -> 0x00fe }
            boolean r10 = r1.getGlobalVisibleRect(r9)     // Catch:{ Exception -> 0x00fe }
            if (r10 == 0) goto L_0x00ce
            org.json.JSONObject r0 = zzl(r0, r9)     // Catch:{ Exception -> 0x00fe }
            goto L_0x00f8
        L_0x00ce:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fe }
            r9.<init>()     // Catch:{ Exception -> 0x00fe }
            r9.put(r7, r11)     // Catch:{ Exception -> 0x00fe }
            r9.put(r6, r11)     // Catch:{ Exception -> 0x00fe }
            r6 = r12[r11]     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r7 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r6 = r7.zzb(r0, r6)     // Catch:{ Exception -> 0x00fe }
            r9.put(r5, r6)     // Catch:{ Exception -> 0x00fe }
            r5 = 1
            r6 = r12[r5]     // Catch:{ Exception -> 0x00fe }
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ Exception -> 0x00fe }
            int r0 = r5.zzb(r0, r6)     // Catch:{ Exception -> 0x00fe }
            r9.put(r4, r0)     // Catch:{ Exception -> 0x00fe }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00fe }
            r0 = r9
        L_0x00f8:
            java.lang.String r2 = "visible_bounds"
            r8.put(r2, r0)     // Catch:{ Exception -> 0x00fe }
            goto L_0x0105
        L_0x00fe:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Unable to get native ad view bounding box"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)
        L_0x0105:
            android.view.ViewParent r0 = r17.getParent()
            if (r0 == 0) goto L_0x012c
            java.lang.Class r2 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x012c, SecurityException -> 0x0124, IllegalAccessException -> 0x0122, InvocationTargetException -> 0x0120 }
            java.lang.String r3 = "getTemplateTypeName"
            java.lang.Class[] r4 = new java.lang.Class[r11]     // Catch:{ NoSuchMethodException -> 0x012c, SecurityException -> 0x0124, IllegalAccessException -> 0x0122, InvocationTargetException -> 0x0120 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x012c, SecurityException -> 0x0124, IllegalAccessException -> 0x0122, InvocationTargetException -> 0x0120 }
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x012c, SecurityException -> 0x0124, IllegalAccessException -> 0x0122, InvocationTargetException -> 0x0120 }
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch:{ NoSuchMethodException -> 0x012c, SecurityException -> 0x0124, IllegalAccessException -> 0x0122, InvocationTargetException -> 0x0120 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NoSuchMethodException -> 0x012c, SecurityException -> 0x0124, IllegalAccessException -> 0x0122, InvocationTargetException -> 0x0120 }
            goto L_0x012e
        L_0x0120:
            r0 = move-exception
            goto L_0x0125
        L_0x0122:
            r0 = move-exception
            goto L_0x0125
        L_0x0124:
            r0 = move-exception
        L_0x0125:
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Cannot access method getTemplateTypeName: "
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r0)
        L_0x012c:
            java.lang.String r0 = ""
        L_0x012e:
            r10 = -1
            int r2 = r0.hashCode()     // Catch:{ JSONException -> 0x0168 }
            r3 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r2 == r3) goto L_0x0148
            r3 = 2019754500(0x78630204, float:1.8417067E34)
            if (r2 == r3) goto L_0x013e
            goto L_0x0152
        L_0x013e:
            java.lang.String r2 = "medium_template"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0152
            r0 = 1
            goto L_0x0153
        L_0x0148:
            java.lang.String r2 = "small_template"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0152
            r0 = r11
            goto L_0x0153
        L_0x0152:
            r0 = r10
        L_0x0153:
            java.lang.String r2 = "native_template_type"
            if (r0 == 0) goto L_0x0163
            r3 = 1
            if (r0 == r3) goto L_0x015e
            r8.put(r2, r11)     // Catch:{ JSONException -> 0x0168 }
            goto L_0x0170
        L_0x015e:
            r3 = 2
            r8.put(r2, r3)     // Catch:{ JSONException -> 0x0168 }
            goto L_0x0170
        L_0x0163:
            r3 = 1
            r8.put(r2, r3)     // Catch:{ JSONException -> 0x0168 }
            goto L_0x0170
        L_0x0168:
            r0 = move-exception
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Could not log native template signal to JSON"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r0)
        L_0x0170:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzip
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01a4
            android.view.ViewGroup$LayoutParams r0 = r17.getLayoutParams()     // Catch:{ Exception -> 0x019f }
            java.lang.String r2 = "view_width_layout_type"
            int r3 = r0.width     // Catch:{ Exception -> 0x019f }
            int r3 = zzm(r3)     // Catch:{ Exception -> 0x019f }
            int r3 = r3 + r10
            r8.put(r2, r3)     // Catch:{ Exception -> 0x019f }
            java.lang.String r2 = "view_height_layout_type"
            int r0 = r0.height     // Catch:{ Exception -> 0x019f }
            int r0 = zzm(r0)     // Catch:{ Exception -> 0x019f }
            int r0 = r0 + r10
            r8.put(r2, r0)     // Catch:{ Exception -> 0x019f }
            goto L_0x01a4
        L_0x019f:
            java.lang.String r0 = "Unable to get native ad view layout types"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        L_0x01a4:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzir
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c9
            java.lang.String r0 = "alpha"
            float r1 = r17.getAlpha()     // Catch:{ JSONException -> 0x01c1 }
            double r1 = (double) r1     // Catch:{ JSONException -> 0x01c1 }
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x01c1 }
            goto L_0x01c9
        L_0x01c1:
            r0 = move-exception
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Could not log container view alpha signal to JSON"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
        L_0x01c9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbv.zzh(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzi(Context context, zzfca zzfca) {
        if (!zzfca.zzN) {
            return false;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzis)).booleanValue()) {
            return ((Boolean) zzbd.zzc().zzb(zzbde.zziv)).booleanValue();
        }
        String str = (String) zzbd.zzc().zzb(zzbde.zzit);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            for (String equals : zzfwe.zzb(zzfva.zzc(';')).zzd(str)) {
                if (equals.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzj(int i) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzdL)).booleanValue()) {
            return true;
        }
        return ((Boolean) zzbd.zzc().zzb(zzbde.zzdM)).booleanValue() || i <= 15299999;
    }

    public static int[] zzk(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject zzl(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzbb.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put("height", zzbb.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", zzbb.zzb().zzb(context, rect.left));
        jSONObject.put("y", zzbb.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzm(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
