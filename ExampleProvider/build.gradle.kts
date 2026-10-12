
dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

version = 1

cloudstream {
    description = "CineHype movie and series provider"
    authors = listOf("mrikcomics-tech")

    status = 3

    tvTypes = listOf("Movie", "TvSeries")

    requiresResources = true
    language = "en"

    iconUrl = "https://www.cinehype.sc/favicon.ico"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}

