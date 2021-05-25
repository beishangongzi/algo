package _2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class _1 {

    static int mod=(int)1e9+7;
    //static int MAXN=500, MAXE=500;


    static long[][] perm_table(int N, int E) {
        //long t0=System.currentTimeMillis();
        long[][] f=new long[N+1][];
        f[0]=new long[] {0}; f[1]=new long[] {1,0}; f[2]=new long[] {1,1,0};
        for (int i=3; i<f.length; i++) {
            f[i]=new long[i*(i-1)/2+1];
            f[i][0]=1;
            for (int j=1; j<f[i].length; j++) {
                f[i][j]=f[i][j-1];
                if(j<f[i-1].length) {
                    f[i][j]+=f[i-1][j];

                    if(f[i][j]<0) {f[i][j]+=mod;}
                    if(f[i][j]>mod) {f[i][j]-=mod;}
                }

                if(j>=i&&j-i<f[i-1].length) {
                    f[i][j]-=f[i-1][j-i];

                    if(f[i][j]<0) {f[i][j]+=mod;}
                    if(f[i][j]>mod) {f[i][j]-=mod;}
                }
            }
        }

        for (int i=0; i<f.length; i++) {
            for (int j=1; j<f[i].length; j++) {
                f[i][j]+=f[i][j-1];

                if(f[i][j]<0) {f[i][j]+=mod;}
                if(f[i][j]>mod) {f[i][j]-=mod;}
            }
        }
        //System.out.println(System.currentTimeMillis()-t0);
        return f;
    }

    static void solve(int[][] q) {
        int MAXN=0, MAXE=0;
        for (int i=0; i<q.length; i++) {
            MAXN=Math.max(q[i][0], MAXN);
            MAXE=Math.max(q[i][1], MAXE);
        }

        MAXE=Math.min(MAXE, MAXN*(MAXN-1)/2);

        long[][] p=perm_table(MAXN, MAXE);
        long[] fac=factorialTable(MAXN, mod);
        long[][] nCk=nCkTable(MAXN, MAXN, mod);

        StringBuilder sb=new StringBuilder();
        for (int[] ints : q) {
            int N = ints[0], E = ints[1];

            long ret = 0;
            for (int l = 1; l <= N; l++) {
                long pcnt = p[l][Math.min(E, l * (l - 1) / 2)];
                long pcnt1 = mod(mod(nCk[N][l] * pcnt, mod) * fac[N - l], mod);
                long pcnt2 = mod(mod(nCk[N][l] * (N - l + 1), mod) * fac[N - l], mod);
                ret += mod(pcnt1 * pcnt2, mod);
                if (ret >= mod) {
                    ret -= mod;
                }
            }

            sb.append(ret).append("\n");
        }
        System.out.print(sb.toString());
    }

    static void run_stream() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());
        int[][] q=new int[T][2];
        for (int test=0; test<T; test++) {
            String[] ne=br.readLine().trim().split(" ");
            int N=Integer.parseInt(ne[0].trim());
            int E=Integer.parseInt(ne[1].trim());
            q[test][0]=N; q[test][1]=E;
        }

        solve(q);
    }


    public static void main(String[] args) throws IOException {
        run_stream();
    }


    public static long mod(long n, long mod) {
        long ret=n%mod;
        if(ret<0) {
            ret+=mod;
        }
        return ret;
    }

    static HashMap<Long, ArrayList<Long>>
            fac_cache=new HashMap<Long, ArrayList<Long>>();

    public static void factorial(int n, long mod) {
        ArrayList<Long> l=fac_cache.get(mod);
        if(l==null) {
            l=new ArrayList<Long>();
            l.add(1L);
            fac_cache.put(mod, l);
        }

        if(n<l.size()) {
            return;
        }
        long ret=l.get(l.size()-1);
        for (long i=l.size(); i<=n; i++) {
            ret*=i; ret%=mod; l.add(ret);
        }
    }

    public static long[] factorialTable(int n, long mod) {
        factorial(n, mod);
        ArrayList<Long> l=fac_cache.get(mod);
        long[] ret=new long[l.size()];
        for (int i=0; i<ret.length; i++) {
            ret[i]=l.get(i);
        }
        return ret;
    }

    public static long[][] nCkTable(int maxn, int maxk, long mod) {
        long[][] nk=new long[maxn+1][maxk+1];
        for (int i=0; i<=maxn; i++) {
            nk[i][0]=1;
        }
        for (int n=1; n<=maxn; n++) {
            for (int k=1; k<=Math.min(maxk, maxn); k++) {
                nk[n][k]=nk[n-1][k-1]+nk[n-1][k];
                if(nk[n][k]>mod) {
                    nk[n][k]-=mod;
                }
            }
        }
        return nk;
    }
}