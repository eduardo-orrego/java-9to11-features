// The Java Platform Module System (JPMS), introduced in Java 9,
// allows modularization of Java applications by grouping classes
// and packages into modules, improving encapsulation and reducing
// application size. In Java 11, the stability of the module
// system is further refined.

module org.xuaxpedia {
  requires java.base;
  requires java.logging;
  requires java.net.http;
}
