package io.github.aravindvasudev.server;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.JarScanFilter;
import org.apache.tomcat.JarScanType;
import org.apache.tomcat.JarScanner;
import org.apache.tomcat.JarScannerCallback;
import org.apache.tomcat.util.scan.StandardJarScanner;

import javax.servlet.ServletContext;
import java.io.File;

public class Server {
    public static final String WEBAPP_PATH = "src/main/webapp/";
    public static final String ABSOLUTE_WEBAPP_PATH = new File(WEBAPP_PATH).getAbsolutePath();
    public static final int DEFAULT_PORT = 8080;
    public static final int PORT = (System.getenv("PORT") == null || System.getenv("PORT").isEmpty())
            ? DEFAULT_PORT : Integer.valueOf(System.getenv("PORT"));

    private Tomcat tomcat;

    public Server() {
        tomcat = new Tomcat();

        tomcat.setPort(Integer.valueOf(PORT));
        Context context = tomcat.addWebapp("/", ABSOLUTE_WEBAPP_PATH);

        ((StandardJarScanner) context.getJarScanner()).setScanManifest(false);
    }

    public void start() throws LifecycleException {
        tomcat.start();
        tomcat.getServer().await();
    }

    public static void main(String[] args) throws Exception {
        new Server().start();
    }
}
