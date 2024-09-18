package org.xuaxpedia.javatimeversion;

public class JavaTimeVersionDemo01 {

    public static void main(String[] args) {

        // Java adopts a time-based versioning scheme, such as Java 11 and Java 12,
        // ensuring a new version every six months. This approach facilitates
        // planning and adoption of new features by naming versions according
        // to the year and month of their release.
        // $FEATURE.$INTERIM.$UPDATE.$PATCH

        Runtime.Version version = Runtime.version();
        System.out.printf(" feature: %s%n interim: %s%n update: %s%n patch: %s%n",
                version.feature(),
                version.interim(),
                version.update(),
                version.patch());
    }

}
