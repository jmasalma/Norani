package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcbz extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcbx {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzcby zzb;
    private final float[] zzc = new float[9];
    private final float[] zzd = new float[9];
    private final float[] zze = new float[9];
    private final float[] zzf = new float[9];
    private final float[] zzg = new float[9];
    private final float[] zzh = new float[9];
    private final float[] zzi = new float[9];
    private float zzj = Float.NaN;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzcbz(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        zzcby zzcby = new zzcby(context);
        this.zzb = zzcby;
        zzcby.zzb(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[1];
        float f2 = fArr3[3];
        float f3 = fArr2[2];
        float f4 = fArr3[6];
        fArr[0] = (fArr2[0] * fArr3[0]) + (f * f2) + (f3 * f4);
        float f5 = fArr2[0];
        float f6 = fArr3[4];
        float f7 = fArr3[7];
        fArr[1] = (fArr3[1] * f5) + (f * f6) + (f3 * f7);
        float f8 = f5 * fArr3[2];
        float f9 = fArr2[1];
        float f10 = fArr3[5];
        float f11 = fArr3[8];
        fArr[2] = f8 + (f9 * f10) + (f3 * f11);
        float f12 = fArr2[3];
        float f13 = fArr3[0];
        float f14 = fArr2[4];
        float f15 = fArr2[5];
        fArr[3] = (f12 * f13) + (f2 * f14) + (f15 * f4);
        float f16 = fArr2[3];
        float f17 = fArr3[1];
        fArr[4] = (f16 * f17) + (f14 * f6) + (f15 * f7);
        float f18 = fArr3[2];
        fArr[5] = (f16 * f18) + (fArr2[4] * f10) + (f15 * f11);
        float f19 = fArr2[6] * f13;
        float f20 = fArr2[7];
        float f21 = fArr2[8];
        fArr[6] = f19 + (fArr3[3] * f20) + (f4 * f21);
        float f22 = fArr2[6];
        fArr[7] = (f17 * f22) + (f20 * fArr3[4]) + (f7 * f21);
        fArr[8] = (f22 * f18) + (fArr2[7] * fArr3[5]) + (f21 * f11);
    }

    private static final void zzj(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static final void zzk(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzh("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c7 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            android.graphics.SurfaceTexture r0 = r1.zzp
            if (r0 == 0) goto L_0x036f
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r1.zzw = r0
            java.lang.Object r2 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r2)
            r1.zzx = r0
            javax.microedition.khronos.egl.EGLDisplay r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r2) goto L_0x0021
        L_0x001e:
            r0 = r6
            goto L_0x008f
        L_0x0021:
            int[] r0 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r2 = r1.zzw
            javax.microedition.khronos.egl.EGLDisplay r7 = r1.zzx
            boolean r0 = r2.eglInitialize(r7, r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x001e
        L_0x002e:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r2 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r1.zzw
            javax.microedition.khronos.egl.EGLDisplay r8 = r1.zzx
            r11 = 1
            r10 = r2
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x0048
        L_0x0046:
            r0 = r4
            goto L_0x004e
        L_0x0048:
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0046
            r0 = r2[r6]
        L_0x004e:
            if (r0 != 0) goto L_0x0051
            goto L_0x001e
        L_0x0051:
            r2 = 12440(0x3098, float:1.7432E-41)
            r7 = 12344(0x3038, float:1.7298E-41)
            int[] r2 = new int[]{r2, r3, r7}
            javax.microedition.khronos.egl.EGL10 r7 = r1.zzw
            javax.microedition.khronos.egl.EGLDisplay r8 = r1.zzx
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r2 = r7.eglCreateContext(r8, r0, r9, r2)
            r1.zzy = r2
            if (r2 == 0) goto L_0x001e
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r2 != r7) goto L_0x006c
            goto L_0x001e
        L_0x006c:
            javax.microedition.khronos.egl.EGL10 r2 = r1.zzw
            javax.microedition.khronos.egl.EGLDisplay r7 = r1.zzx
            android.graphics.SurfaceTexture r8 = r1.zzp
            javax.microedition.khronos.egl.EGLSurface r0 = r2.eglCreateWindowSurface(r7, r0, r8, r4)
            r1.zzz = r0
            if (r0 == 0) goto L_0x001e
            javax.microedition.khronos.egl.EGLSurface r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r2) goto L_0x007f
            goto L_0x001e
        L_0x007f:
            javax.microedition.khronos.egl.EGL10 r0 = r1.zzw
            javax.microedition.khronos.egl.EGLDisplay r2 = r1.zzx
            javax.microedition.khronos.egl.EGLSurface r7 = r1.zzz
            javax.microedition.khronos.egl.EGLContext r8 = r1.zzy
            boolean r0 = r0.eglMakeCurrent(r2, r7, r7, r8)
            if (r0 != 0) goto L_0x008e
            goto L_0x001e
        L_0x008e:
            r0 = r5
        L_0x008f:
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzbw
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r7.zzb(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.zzl()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00b0
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r7.zzb(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r2 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00b2:
            r7 = 35633(0x8b31, float:4.9932E-41)
            int r2 = zzl(r7, r2)
            if (r2 != 0) goto L_0x00be
        L_0x00bb:
            r9 = r6
            goto L_0x0140
        L_0x00be:
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zzbx
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r8.zzb(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.zzl()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00df
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00e1
        L_0x00df:
            java.lang.String r7 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00e1:
            r8 = 35632(0x8b30, float:4.9931E-41)
            int r7 = zzl(r8, r7)
            if (r7 != 0) goto L_0x00eb
            goto L_0x00bb
        L_0x00eb:
            java.lang.String r8 = "createProgram"
            int r9 = android.opengl.GLES20.glCreateProgram()
            zzh(r8)
            if (r9 == 0) goto L_0x0140
            android.opengl.GLES20.glAttachShader(r9, r2)
            java.lang.String r2 = "attachShader"
            zzh(r2)
            android.opengl.GLES20.glAttachShader(r9, r7)
            java.lang.String r2 = "attachShader"
            zzh(r2)
            android.opengl.GLES20.glLinkProgram(r9)
            java.lang.String r2 = "linkProgram"
            zzh(r2)
            int[] r2 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r9, r7, r2, r6)
            java.lang.String r7 = "getProgramiv"
            zzh(r7)
            r2 = r2[r6]
            if (r2 == r5) goto L_0x0138
            java.lang.String r2 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r2, r7)
            java.lang.String r2 = android.opengl.GLES20.glGetProgramInfoLog(r9)
            java.lang.String r7 = "SphericalVideoRenderer"
            android.util.Log.e(r7, r2)
            android.opengl.GLES20.glDeleteProgram(r9)
            java.lang.String r2 = "deleteProgram"
            zzh(r2)
            goto L_0x00bb
        L_0x0138:
            android.opengl.GLES20.glValidateProgram(r9)
            java.lang.String r2 = "validateProgram"
            zzh(r2)
        L_0x0140:
            r1.zzq = r9
            android.opengl.GLES20.glUseProgram(r9)
            java.lang.String r2 = "useProgram"
            zzh(r2)
            int r2 = r1.zzq
            java.lang.String r7 = "aPosition"
            int r2 = android.opengl.GLES20.glGetAttribLocation(r2, r7)
            r12 = 12
            java.nio.FloatBuffer r13 = r1.zzt
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r8 = r2
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            zzh(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r2)
            java.lang.String r2 = "enableVertexAttribArray"
            zzh(r2)
            int[] r2 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r2, r6)
            java.lang.String r7 = "genTextures"
            zzh(r7)
            r2 = r2[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r2)
            java.lang.String r8 = "bindTextures"
            zzh(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            zzh(r7)
            int r7 = r1.zzq
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r1.zzr = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r1.zzq
            if (r0 == 0) goto L_0x033f
            if (r7 != 0) goto L_0x01cb
            goto L_0x033f
        L_0x01cb:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r2)
            r1.zzo = r0
            r0.setOnFrameAvailableListener(r1)
            java.util.concurrent.CountDownLatch r0 = r1.zzu
            r0.countDown()
            com.google.android.gms.internal.ads.zzcby r2 = r1.zzb
            r2.zzc()
            r1.zzA = r5     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
        L_0x01e1:
            boolean r0 = r1.zzB     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            if (r0 == 0) goto L_0x01e7
            goto L_0x031e
        L_0x01e7:
            int r0 = r1.zzs     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            if (r0 <= 0) goto L_0x01f7
            android.graphics.SurfaceTexture r0 = r1.zzo     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r0 = r1.zzs     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r0 = r0 + -1
            r1.zzs = r0     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            goto L_0x01e7
        L_0x01f7:
            float[] r0 = r1.zzc     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            boolean r7 = r2.zze(r0)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r8 = 5
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            r10 = 4
            if (r7 == 0) goto L_0x0266
            float r7 = r1.zzj     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            boolean r7 = java.lang.Float.isNaN(r7)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            if (r7 == 0) goto L_0x025b
            r7 = 3
            float[] r11 = new float[r7]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r11 = {0, 1065353216, 0} // fill-array     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r12 = r0[r6]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r13 = r11[r6]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r12 = r12 * r13
            r14 = r0[r5]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r11 = r11[r5]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r14 = r14 * r11
            float r12 = r12 + r14
            r14 = r0[r3]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r15 = 0
            float r14 = r14 * r15
            float r12 = r12 + r14
            r14 = r0[r7]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r14 = r14 * r13
            r16 = r0[r10]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r16 = r16 * r11
            float r14 = r14 + r16
            r16 = r0[r8]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r16 = r16 * r15
            float r14 = r14 + r16
            r16 = 6
            r16 = r0[r16]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r16 = r16 * r13
            r13 = 7
            r13 = r0[r13]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r13 = r13 * r11
            float r16 = r16 + r13
            r11 = 8
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r11 = r11 * r15
            float r16 = r16 + r11
            float[] r7 = new float[r7]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r7[r6] = r12     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r7[r5] = r14     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r7[r3] = r16     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r11 = r7[r5]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            double r11 = (double) r11     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r7 = r7[r6]     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            double r13 = (double) r7     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            double r11 = java.lang.Math.atan2(r11, r13)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r7 = (float) r11     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r7 = r7 + r9
            float r7 = -r7
            r1.zzj = r7     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
        L_0x025b:
            float[] r7 = r1.zzh     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r9 = r1.zzj     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r11 = r1.zzk     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r9 = r9 + r11
            zzk(r7, r9)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            goto L_0x0270
        L_0x0266:
            zzj(r0, r9)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float[] r7 = r1.zzh     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r9 = r1.zzk     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            zzk(r7, r9)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
        L_0x0270:
            float[] r7 = r1.zzd     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r9 = 1070141403(0x3fc90fdb, float:1.5707964)
            zzj(r7, r9)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float[] r9 = r1.zze     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float[] r11 = r1.zzh     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            zzi(r9, r11, r7)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float[] r7 = r1.zzf     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            zzi(r7, r0, r9)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float[] r0 = r1.zzg     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r9 = r1.zzl     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            zzj(r0, r9)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float[] r9 = r1.zzi     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            zzi(r9, r0, r7)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r0 = r1.zzr     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r9, r6)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            android.opengl.GLES20.glDrawArrays(r8, r6, r10)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            java.lang.String r0 = "drawArrays"
            zzh(r0)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            javax.microedition.khronos.egl.EGL10 r0 = r1.zzw     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            javax.microedition.khronos.egl.EGLDisplay r7 = r1.zzx     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            javax.microedition.khronos.egl.EGLSurface r8 = r1.zzz     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r0.eglSwapBuffers(r7, r8)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            boolean r0 = r1.zzA     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            if (r0 == 0) goto L_0x02ed
            int r0 = r1.zzn     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r7 = r1.zzm     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r7)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            java.lang.String r0 = "viewport"
            zzh(r0)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r0 = r1.zzq     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            java.lang.String r7 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r7)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r7 = r1.zzq     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            java.lang.String r8 = "uFOVy"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r8 = r1.zzn     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r9 = r1.zzm     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            r10 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r8 <= r9) goto L_0x02e1
            android.opengl.GLES20.glUniform1f(r0, r10)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            int r0 = r1.zzm     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r0 = r0 * r10
            int r8 = r1.zzn     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r0 = r0 / r8
            android.opengl.GLES20.glUniform1f(r7, r0)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            goto L_0x02eb
        L_0x02e1:
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r8 = r8 * r10
            float r9 = (float) r9     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            float r8 = r8 / r9
            android.opengl.GLES20.glUniform1f(r0, r8)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
            android.opengl.GLES20.glUniform1f(r7, r10)     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
        L_0x02eb:
            r1.zzA = r6     // Catch:{ IllegalStateException -> 0x0317, all -> 0x0305 }
        L_0x02ed:
            java.lang.Object r7 = r1.zzv     // Catch:{ InterruptedException -> 0x01e1 }
            monitor-enter(r7)     // Catch:{ InterruptedException -> 0x01e1 }
            boolean r0 = r1.zzB     // Catch:{ all -> 0x0302 }
            if (r0 != 0) goto L_0x02ff
            boolean r0 = r1.zzA     // Catch:{ all -> 0x0302 }
            if (r0 != 0) goto L_0x02ff
            int r0 = r1.zzs     // Catch:{ all -> 0x0302 }
            if (r0 != 0) goto L_0x02ff
            r7.wait()     // Catch:{ all -> 0x0302 }
        L_0x02ff:
            monitor-exit(r7)     // Catch:{ all -> 0x0302 }
            goto L_0x01e1
        L_0x0302:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0302 }
            throw r0     // Catch:{ InterruptedException -> 0x01e1 }
        L_0x0305:
            r0 = move-exception
            java.lang.String r2 = "SphericalVideoProcessor died."
            int r3 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x032e }
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r0)     // Catch:{ all -> 0x032e }
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x032e }
            java.lang.String r3 = "SphericalVideoProcessor.run.2"
            r2.zzw(r0, r3)     // Catch:{ all -> 0x032e }
            goto L_0x031e
        L_0x0317:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x032e }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x032e }
        L_0x031e:
            com.google.android.gms.internal.ads.zzcby r0 = r1.zzb
            r0.zzd()
            android.graphics.SurfaceTexture r0 = r1.zzo
            r0.setOnFrameAvailableListener(r4)
            r1.zzo = r4
            r17.zzg()
            return
        L_0x032e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcby r2 = r1.zzb
            r2.zzd()
            android.graphics.SurfaceTexture r2 = r1.zzo
            r2.setOnFrameAvailableListener(r4)
            r1.zzo = r4
            r17.zzg()
            throw r0
        L_0x033f:
            javax.microedition.khronos.egl.EGL10 r0 = r1.zzw
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "EGL initialization failed: "
            java.lang.String r0 = r2.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r2.zzw(r3, r0)
            r17.zzg()
            java.util.concurrent.CountDownLatch r0 = r1.zzu
            r0.countDown()
            return
        L_0x036f:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
            java.util.concurrent.CountDownLatch r0 = r1.zzu
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbz.run():void");
    }

    public final void zza() {
        Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final SurfaceTexture zzb() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzc(int i, int i2) {
        Object obj = this.zzv;
        synchronized (obj) {
            this.zzn = i;
            this.zzm = i2;
            this.zzA = true;
            obj.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzn = i;
        this.zzm = i2;
        this.zzp = surfaceTexture;
    }

    public final void zze() {
        Object obj = this.zzv;
        synchronized (obj) {
            this.zzB = true;
            this.zzp = null;
            obj.notifyAll();
        }
    }

    public final void zzf(float f, float f2) {
        int i = this.zzn;
        int i2 = this.zzm;
        if (i <= i2) {
            i = i2;
        }
        float f3 = (float) i;
        this.zzk -= (f * 1.7453293f) / f3;
        float f4 = this.zzl - ((f2 * 1.7453293f) / f3);
        this.zzl = f4;
        if (f4 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        EGLSurface eGLSurface = this.zzz;
        boolean z = false;
        if (!(eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE)) {
            z = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            z |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.zzw.eglTerminate(eGLDisplay) | z;
        this.zzx = null;
        return eglTerminate;
    }
}
