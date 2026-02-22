# Android Development A to Z সম্পূর্ণ গাইড (বাংলা)
## Kotlin | XML Layout | Jetpack Compose

Android Development হলো Google-এর Android অপারেটিং সিস্টেমের জন্য মোবাইল অ্যাপ্লিকেশন তৈরি করার প্রক্রিয়া। Kotlin হলো Android-এর অফিসিয়াল প্রোগ্রামিং ভাষা। XML Layout ঐতিহ্যবাহী পদ্ধতি এবং Jetpack Compose হলো আধুনিক ডিক্লারেটিভ UI টুলকিট।

---

## বিষয়সূচি

### প্রথম ভাগ – Kotlin ও Android মূল বিষয়
1. [Android পরিচিতি](#android-পরিচিতি)
2. [পরিবেশ সেটআপ](#পরিবেশ-সেটআপ)
3. [প্রথম Android প্রজেক্ট](#প্রথম-android-প্রজেক্ট)
4. [Android প্রজেক্ট কাঠামো](#android-প্রজেক্ট-কাঠামো)
5. [Android Manifest](#android-manifest)
6. [Activity](#activity)
7. [Fragment](#fragment)
8. [Activity ও Fragment লাইফসাইকেল](#লাইফসাইকেল)

### দ্বিতীয় ভাগ – XML Layout (ঐতিহ্যবাহী পদ্ধতি)
9. [XML Layout পরিচিতি](#xml-layout-পরিচিতি)
10. [LinearLayout](#linearlayout)
11. [RelativeLayout](#relativelayout)
12. [ConstraintLayout](#constraintlayout)
13. [RecyclerView](#recyclerview)
14. [ViewBinding](#viewbinding)
15. [XML উইজেট সমূহ](#xml-উইজেট-সমূহ)
16. [Menu ও ActionBar](#menu-ও-actionbar)
17. [Dialog ও Toast](#dialog-ও-toast)
18. [Styles ও Themes (XML)](#styles-ও-themes)

### তৃতীয় ভাগ – Jetpack Compose (আধুনিক পদ্ধতি)
19. [Jetpack Compose পরিচিতি](#jetpack-compose-পরিচিতি)
20. [Composable ফাংশন](#composable-ফাংশন)
21. [Compose লেআউট](#compose-লেআউট)
22. [Compose উইজেট](#compose-উইজেট)
23. [State in Compose](#state-in-compose)
24. [LazyList ও LazyGrid](#lazylist-ও-lazygrid)
25. [Compose Navigation](#compose-navigation)
26. [Compose Theme ও Material 3](#compose-theme-ও-material-3)
27. [Compose অ্যানিমেশন](#compose-অ্যানিমেশন)

### চতুর্থ ভাগ – Architecture ও Jetpack
28. [MVVM আর্কিটেকচার](#mvvm-আর্কিটেকচার)
29. [ViewModel](#viewmodel)
30. [LiveData ও StateFlow](#livedata-ও-stateflow)
31. [Room Database](#room-database)
32. [Retrofit ও API](#retrofit-ও-api)
33. [Hilt Dependency Injection](#hilt-dependency-injection)
34. [DataStore](#datastore)
35. [WorkManager](#workmanager)
36. [Navigation Component](#navigation-component)

### পঞ্চম ভাগ – উন্নত বিষয়
37. [Coroutines ও Flow](#coroutines-ও-flow)
38. [Firebase ইন্টিগ্রেশন](#firebase-ইন্টিগ্রেশন)
39. [Push Notification](#push-notification)
40. [Permission ম্যানেজমেন্ট](#permission-ম্যানেজমেন্ট)
41. [Camera ও Gallery](#camera-ও-gallery)
42. [Maps ও Location](#maps-ও-location)
43. [টেস্টিং](#টেস্টিং)
44. [অ্যাপ প্রকাশ](#অ্যাপ-প্রকাশ)
45. [সম্পূর্ণ প্রজেক্ট উদাহরণ](#সম্পূর্ণ-প্রজেক্ট-উদাহরণ)

---

## Android পরিচিতি

### Android কী?
Android হলো Google-এর তৈরি Linux-ভিত্তিক ওপেন-সোর্স মোবাইল অপারেটিং সিস্টেম। বিশ্বের সর্বাধিক ব্যবহৃত মোবাইল OS।

### Android ভার্সন ইতিহাস (সংক্ষেপ)

| ভার্সন | নাম | API Level |
|--------|-----|-----------|
| Android 14 | Upside Down Cake | 34 |
| Android 13 | Tiramisu | 33 |
| Android 12 | Snow Cone | 31-32 |
| Android 11 | Red Velvet Cake | 30 |
| Android 10 | Q | 29 |

### Android Development এর দুটি পদ্ধতি

| বৈশিষ্ট্য | XML + View System | Jetpack Compose |
|---------|-----------------|-----------------|
| প্রকৃতি | Imperative (কীভাবে) | Declarative (কী) |
| UI ফাইল | XML ফাইল | Kotlin কোড |
| আপডেট | notifyDataSetChanged() | State পরিবর্তন |
| শেখার সুবিধা | সহজ শুরু | আধুনিক পদ্ধতি |
| প্রজেক্ট | পুরনো প্রজেক্ট | নতুন প্রজেক্ট |

---

## পরিবেশ সেটআপ

### ১. Android Studio ইনস্টল করুন
Android Studio হলো Android ডেভেলপমেন্টের অফিসিয়াল IDE।

**ডাউনলোড:** https://developer.android.com/studio

```bash
# Linux (snap)
sudo snap install android-studio --classic

# macOS (Homebrew)
brew install --cask android-studio
```

### ২. প্রয়োজনীয় SDK ইনস্টল করুন
Android Studio খুলে **SDK Manager** থেকে:
- Android SDK Platform (সর্বশেষ ভার্সন)
- Android SDK Build-Tools
- Android Emulator
- Google Play Services

### ৩. Emulator সেটআপ
**AVD Manager** থেকে ভার্চুয়াল ডিভাইস তৈরি করুন।

```bash
# কমান্ড লাইন থেকে emulator চালু
emulator -avd Pixel_6_API_34
```

### ৪. SDK Path সেটআপ
```bash
# ~/.bashrc বা ~/.zshrc-এ যোগ করুন
export ANDROID_HOME=$HOME/Android/Sdk
export PATH=$PATH:$ANDROID_HOME/emulator
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/platform-tools
```

### ৫. ADB (Android Debug Bridge) যাচাই
```bash
adb devices           # সংযুক্ত ডিভাইস দেখুন
adb install app.apk   # APK ইনস্টল
adb logcat            # লগ দেখুন
```

---

## প্রথম Android প্রজেক্ট

### নতুন প্রজেক্ট তৈরি
1. Android Studio খুলুন
2. **New Project** → **Empty Activity** (XML) বা **Empty Compose Activity**
3. প্রজেক্টের নাম, প্যাকেজ নাম, ভাষা (Kotlin), SDK ভার্সন নির্বাচন করুন

### প্রথম XML অ্যাপ
```kotlin
// MainActivity.kt
package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "স্বাগতম Android-এ! 🎉"
        binding.button.setOnClickListener {
            binding.textView.text = "বাটন চাপা হয়েছে!"
        }
    }
}
```

```xml
<!-- activity_main.xml -->
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="16dp">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="স্বাগতম!"
        android:textSize="24sp"
        android:textStyle="bold"/>

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="ক্লিক করুন"/>

</LinearLayout>
```

### প্রথম Compose অ্যাপ
```kotlin
// MainActivity.kt (Compose)
package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    var message by remember { mutableStateOf("স্বাগতম Android-এ! 🎉") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = message, style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { message = "বাটন চাপা হয়েছে!" }) {
            Text("ক্লিক করুন")
        }
    }
}
```

---

## Android প্রজেক্ট কাঠামো

```
MyApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/myapp/
│   │   │   │   ├── MainActivity.kt        ← মূল Activity
│   │   │   │   ├── ui/                    ← UI ক্লাস
│   │   │   │   ├── viewmodel/             ← ViewModel
│   │   │   │   ├── repository/            ← Repository
│   │   │   │   ├── data/                  ← ডেটা মডেল
│   │   │   │   └── di/                    ← Dependency Injection
│   │   │   ├── res/
│   │   │   │   ├── layout/                ← XML লেআউট
│   │   │   │   ├── drawable/              ← ইমেজ, আইকন
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml        ← টেক্সট
│   │   │   │   │   ├── colors.xml         ← রঙ
│   │   │   │   │   ├── themes.xml         ← থিম
│   │   │   │   │   └── dimens.xml         ← মাপ
│   │   │   │   ├── mipmap/                ← অ্যাপ আইকন
│   │   │   │   └── menu/                  ← মেনু
│   │   │   └── AndroidManifest.xml        ← অ্যাপ কনফিগারেশন
│   │   └── test/                          ← Unit Test
│   │   └── androidTest/                   ← Instrumented Test
│   └── build.gradle.kts                   ← মডিউল বিল্ড কনফিগ
├── build.gradle.kts                       ← প্রজেক্ট বিল্ড কনফিগ
├── settings.gradle.kts
└── gradle.properties
```

### build.gradle.kts (Module)
```kotlin
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.myapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true     // XML-এর জন্য
        compose = true         // Compose-এর জন্য
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }
}

dependencies {
    // AndroidX Core
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    // Compose
    implementation(platform("androidx.compose:compose-bom:2024.01.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.6")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.6")
    implementation("androidx.navigation:navigation-compose:2.7.6")

    // Room
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-compiler:2.50")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Coil (ইমেজ লোড)
    implementation("io.coil-kt:coil:2.5.0")
    implementation("io.coil-kt:coil-compose:2.5.0")
}
```

---

## Android Manifest

### AndroidManifest.xml সম্পূর্ণ উদাহরণ
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <!-- পারমিশন -->
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
    <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>

    <!-- হার্ডওয়্যার ফিচার -->
    <uses-feature android:name="android.hardware.camera" android:required="false"/>

    <application
        android:name=".MyApplication"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.MyApp"
        android:usesCleartextTraffic="false">

        <!-- Main Activity -->
        <activity
            android:name=".MainActivity"
            android:exported="true"
            android:windowSoftInputMode="adjustResize">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>

        <!-- অন্য Activity -->
        <activity
            android:name=".DetailActivity"
            android:parentActivityName=".MainActivity"/>

        <!-- Service -->
        <service android:name=".MyFirebaseMessagingService"
            android:exported="false">
            <intent-filter>
                <action android:name="com.google.firebase.MESSAGING_EVENT"/>
            </intent-filter>
        </service>

        <!-- FileProvider (ছবি শেয়ারের জন্য) -->
        <provider
            android:name="androidx.core.content.FileProvider"
            android:authorities="${applicationId}.fileprovider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data
                android:name="android.support.FILE_PROVIDER_PATHS"
                android:resource="@xml/file_paths"/>
        </provider>

    </application>
</manifest>
```

---

## Activity

### Activity কী?
Activity হলো Android অ্যাপের একটি স্ক্রিন। প্রতিটি স্ক্রিন একটি Activity দ্বারা প্রতিনিধিত্ব করা হয়।

### Activity লাইফসাইকেল
```
onCreate() → onStart() → onResume() → [চলছে]
                                          ↓
                                    onPause()
                                          ↓
                                    onStop()
                                          ↓
                                    onDestroy()
```

```kotlin
class LifecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        // Activity তৈরি – UI সেটআপ করুন
        // savedInstanceState থেকে পুনরুদ্ধার করুন
        Log.d("Lifecycle", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        // Activity দৃশ্যমান হচ্ছে
        Log.d("Lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        // Activity ফোকাসে এসেছে – ইন্টারেক্টিভ
        // ক্যামেরা, সেন্সর শুরু করুন
        Log.d("Lifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        // Activity ফোকাস হারাচ্ছে
        // ক্যামেরা, সেন্সর বন্ধ করুন
        Log.d("Lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        // Activity আর দৃশ্যমান নেই
        // ডেটা সংরক্ষণ করুন
        Log.d("Lifecycle", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        // onStop-এর পর পুনরায় শুরু হচ্ছে
        Log.d("Lifecycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Activity ধ্বংস হচ্ছে – সম্পদ মুক্ত করুন
        Log.d("Lifecycle", "onDestroy")
    }

    // কনফিগারেশন পরিবর্তনে (rotation) state সংরক্ষণ
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("user_name", "করিম")
        outState.putInt("score", 100)
    }
}
```

### Activity-র মধ্যে নেভিগেশন
```kotlin
// সাধারণ নেভিগেশন
val intent = Intent(this, DetailActivity::class.java)
startActivity(intent)

// ডেটা পাঠানো
val intent = Intent(this, DetailActivity::class.java).apply {
    putExtra("product_id", 123)
    putExtra("product_name", "আম")
    putExtra("price", 120.0)
    putStringArrayListExtra("tags", arrayListOf("ফল", "মিষ্টি"))
}
startActivity(intent)

// ডেটা ফিরে পাওয়া (Activity Result API)
val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
    if (result.resultCode == RESULT_OK) {
        val data = result.data?.getStringExtra("selected_item")
        Toast.makeText(this, "নির্বাচিত: $data", Toast.LENGTH_SHORT).show()
    }
}

// লঞ্চ করা
launcher.launch(Intent(this, SelectionActivity::class.java))

// ফলাফল ফেরত দেওয়া (SelectionActivity থেকে)
val resultIntent = Intent().putExtra("selected_item", "আম")
setResult(RESULT_OK, resultIntent)
finish()
```

### ডেটা গ্রহণ করা
```kotlin
class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Intent থেকে ডেটা পড়া
        val productId = intent.getIntExtra("product_id", 0)
        val productName = intent.getStringExtra("product_name") ?: ""
        val price = intent.getDoubleExtra("price", 0.0)
        val tags = intent.getStringArrayListExtra("tags")

        Log.d("Detail", "পণ্য: $productName, মূল্য: $price")
    }
}
```

---

## Fragment

### Fragment কী?
Fragment হলো Activity-র একটি অংশ। একটি Activity-তে একাধিক Fragment থাকতপারে। এটি মডুলার UI তৈরিতে সাহায্য করে।

```kotlin
// Fragment তৈরি করা
class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        observeData()
    }

    private fun setupUI() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ProductAdapter()
        }
        binding.fabAdd.setOnClickListener {
            // FAB ক্লিক
        }
    }

    private fun observeData() {
        // ViewModel থেকে ডেটা পর্যবেক্ষণ
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null  // মেমোরি লিক রোধ
    }
}
```

```xml
<!-- fragment_home.xml -->
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fabAdd"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|end"
        android:layout_margin="16dp"
        android:src="@drawable/ic_add"/>

</FrameLayout>
```

### Fragment-এ আর্গুমেন্ট পাঠানো
```kotlin
// Fragment তৈরি করা companion object দিয়ে
class ProductDetailFragment : Fragment() {

    companion object {
        private const val ARG_PRODUCT_ID = "product_id"

        fun newInstance(productId: Int): ProductDetailFragment {
            return ProductDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PRODUCT_ID, productId)
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val productId = arguments?.getInt(ARG_PRODUCT_ID) ?: return
        // productId ব্যবহার করুন
    }
}

// ব্যবহার
val fragment = ProductDetailFragment.newInstance(productId = 123)
supportFragmentManager.beginTransaction()
    .replace(R.id.fragmentContainer, fragment)
    .addToBackStack(null)
    .commit()
```

---

## লাইফসাইকেল

### Fragment লাইফসাইকেল
```
onAttach() → onCreate() → onCreateView() → onViewCreated()
→ onStart() → onResume() → [দৃশ্যমান]
→ onPause() → onStop() → onDestroyView()
→ onDestroy() → onDetach()
```

### লাইফসাইকেল-সচেতন কম্পোনেন্ট
```kotlin
class SensorActivity : AppCompatActivity(), DefaultLifecycleObserver {

    private lateinit var sensorManager: SensorManager

    override fun onCreate(owner: LifecycleOwner) {
        // শুরু করুন
    }

    override fun onResume(owner: LifecycleOwner) {
        // সেন্সর রেজিস্টার করুন
    }

    override fun onPause(owner: LifecycleOwner) {
        // সেন্সর আনরেজিস্টার করুন
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(this)
    }
}
```

---

# দ্বিতীয় ভাগ – XML Layout

## XML Layout পরিচিতি

### View ও ViewGroup
- **View** – UI উপাদান (TextView, Button, ImageView)
- **ViewGroup** – অন্য View ধারণকারী কনটেইনার (LinearLayout, RelativeLayout, ConstraintLayout)

### সাধারণ Attribute সমূহ
```xml
android:layout_width="match_parent"   <!-- পুরো প্রস্থ নাও -->
android:layout_width="wrap_content"   <!-- প্রয়োজন মতো প্রস্থ -->
android:layout_width="200dp"          <!-- নির্দিষ্ট প্রস্থ -->
android:layout_height="match_parent"
android:layout_height="wrap_content"
android:padding="16dp"                <!-- ভেতরের ফাঁক -->
android:margin="8dp"                  <!-- বাইরের ফাঁক -->
android:visibility="visible"          <!-- দৃশ্যমান -->
android:visibility="gone"             <!-- অদৃশ্য ও জায়গা নেয় না -->
android:visibility="invisible"        <!-- অদৃশ্য কিন্তু জায়গা নেয় -->
android:id="@+id/myView"             <!-- ID -->
android:background="@color/white"     <!-- পটভূমি -->
android:elevation="4dp"              <!-- ছায়া -->
android:alpha="0.5"                  <!-- স্বচ্ছতা -->
```

### Dimension ইউনিট
- **dp** (density-independent pixel) – লেআউটের জন্য
- **sp** (scale-independent pixel) – টেক্সটের জন্য
- **px** – পিক্সেল (এড়িয়ে চলুন)

---

## LinearLayout

```xml
<!-- উল্লম্ব LinearLayout -->
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="16dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="প্রথম"
        android:textSize="18sp"/>

    <View android:layout_width="match_parent" android:layout_height="8dp"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="দ্বিতীয়"/>

    <!-- weight ব্যবহার -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="48dp"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="বাতিল"/>

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="2"
            android:text="নিশ্চিত"/>
    </LinearLayout>

</LinearLayout>
```

---

## RelativeLayout

```xml
<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <!-- কেন্দ্রে -->
    <TextView
        android:id="@+id/tvTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="কেন্দ্রে"/>

    <!-- উপরে বাম কোণে -->
    <ImageView
        android:id="@+id/ivLogo"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_alignParentTop="true"
        android:layout_alignParentStart="true"
        android:src="@drawable/ic_logo"/>

    <!-- tvTitle-এর নিচে -->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/tvTitle"
        android:layout_centerHorizontal="true"
        android:text="শিরোনামের নিচে"/>

    <!-- নিচে ডান কোণে -->
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_alignParentEnd="true"
        android:text="পরবর্তী"/>

</RelativeLayout>
```

---

## ConstraintLayout

ConstraintLayout হলো সবচেয়ে শক্তিশালী এবং পারফরম্যান্ট লেআউট। Flat hierarchy তৈরি করে নেস্টিং কমায়।

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <!-- উপরে বাম থেকে ১৬dp -->
    <ImageView
        android:id="@+id/ivProfile"
        android:layout_width="60dp"
        android:layout_height="60dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        android:src="@drawable/ic_profile"/>

    <!-- ivProfile-এর ডানে, উপরে অ্যালাইন -->
    <TextView
        android:id="@+id/tvName"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="12dp"
        android:text="করিম সাহেব"
        android:textSize="18sp"
        android:textStyle="bold"
        app:layout_constraintTop_toTopOf="@id/ivProfile"
        app:layout_constraintStart_toEndOf="@id/ivProfile"
        app:layout_constraintEnd_toEndOf="parent"/>

    <!-- tvName-এর নিচে -->
    <TextView
        android:id="@+id/tvRole"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="12dp"
        android:layout_marginTop="4dp"
        android:text="সফটওয়্যার ইঞ্জিনিয়ার"
        android:textColor="#666666"
        app:layout_constraintTop_toBottomOf="@id/tvName"
        app:layout_constraintStart_toEndOf="@id/ivProfile"
        app:layout_constraintEnd_toEndOf="parent"/>

    <!-- নিচে কেন্দ্রে -->
    <Button
        android:id="@+id/btnEdit"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="প্রোফাইল সম্পাদনা"
        app:layout_constraintTop_toBottomOf="@id/ivProfile"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <!-- প্যারেন্টের একদম নিচে -->
    <Button
        android:layout_width="0dp"
        android:layout_height="52dp"
        android:text="লগ আউট"
        android:backgroundTint="#F44336"
        android:textColor="@android:color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <!-- Guideline – ৫০% অনুভূমিক -->
    <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintGuide_percent="0.5"/>

    <!-- Chain – সমান দূরত্বে বাটন -->
    <Button
        android:id="@+id/btn1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="এক"
        app:layout_constraintTop_toTopOf="@id/guideline"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/btn2"
        app:layout_constraintHorizontal_chainStyle="spread"/>

    <Button
        android:id="@+id/btn2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="দুই"
        app:layout_constraintTop_toTopOf="@id/guideline"
        app:layout_constraintStart_toEndOf="@id/btn1"
        app:layout_constraintEnd_toEndOf="parent"/>

</androidx.constraintlayout.widget.ConstraintLayout>
```

---

## RecyclerView

### RecyclerView সেটআপ
```kotlin
// Data Model
data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val imageUrl: String,
    val category: String
)
```

```xml
<!-- item_product.xml -->
<?xml version="1.0" encoding="utf-8"?>
<com.google.android.material.card.MaterialCardView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="8dp"
    app:cardCornerRadius="12dp"
    app:cardElevation="4dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="12dp">

        <ImageView
            android:id="@+id/ivProduct"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:scaleType="centerCrop"/>

        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginStart="12dp"
            android:orientation="vertical"
            android:gravity="center_vertical">

            <TextView
                android:id="@+id/tvName"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textSize="16sp"
                android:textStyle="bold"/>

            <TextView
                android:id="@+id/tvCategory"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="#888"
                android:textSize="13sp"/>

            <TextView
                android:id="@+id/tvPrice"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textColor="#4CAF50"
                android:textSize="15sp"
                android:textStyle="bold"/>

        </LinearLayout>

        <ImageButton
            android:id="@+id/ibFavorite"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="?attr/selectableItemBackgroundBorderless"
            android:src="@drawable/ic_favorite_border"/>

    </LinearLayout>
</com.google.android.material.card.MaterialCardView>
```

```kotlin
// Adapter
class ProductAdapter(
    private val onItemClick: (Product) -> Unit,
    private val onFavoriteClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    private val products = mutableListOf<Product>()

    fun submitList(newList: List<Product>) {
        products.clear()
        products.addAll(newList)
        notifyDataSetChanged()
    }

    inner class ProductViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Product) {
            binding.tvName.text = product.name
            binding.tvCategory.text = product.category
            binding.tvPrice.text = "৳${product.price}"

            // Coil দিয়ে ছবি লোড
            binding.ivProduct.load(product.imageUrl) {
                placeholder(R.drawable.ic_placeholder)
                error(R.drawable.ic_error)
                crossfade(true)
            }

            binding.root.setOnClickListener { onItemClick(product) }
            binding.ibFavorite.setOnClickListener { onFavoriteClick(product) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }

    override fun getItemCount() = products.size
}

// DiffUtil দিয়ে দক্ষ আপডেট (ListAdapter ব্যবহার)
class ProductDiffCallback : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Product, newItem: Product) = oldItem == newItem
}

class ProductListAdapter(
    private val onItemClick: (Product) -> Unit
) : ListAdapter<Product, ProductListAdapter.ViewHolder>(ProductDiffCallback()) {

    inner class ViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.tvName.text = product.name
            binding.root.setOnClickListener { onItemClick(product) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(getItem(position))
}
```

```kotlin
// Activity/Fragment-এ ব্যবহার
class ProductListFragment : Fragment(R.layout.fragment_product_list) {

    private var _binding: FragmentProductListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ProductViewModel by viewModels()
    private lateinit var adapter: ProductListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProductListBinding.bind(view)

        setupRecyclerView()
        observeProducts()
    }

    private fun setupRecyclerView() {
        adapter = ProductListAdapter { product ->
            // আইটেম ক্লিক হ্যান্ডলার
            val action = ProductListFragmentDirections.actionToDetail(product.id)
            findNavController().navigate(action)
        }

        binding.recyclerView.apply {
            this.adapter = this@ProductListFragment.adapter
            layoutManager = LinearLayoutManager(requireContext())

            // GridLayout
            // layoutManager = GridLayoutManager(requireContext(), 2)

            // Divider
            addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
        }
    }

    private fun observeProducts() {
        viewModel.products.observe(viewLifecycleOwner) { products ->
            adapter.submitList(products)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
```

---

## ViewBinding

### ViewBinding কী?
XML লেআউট ফাইলের জন্য স্বয়ংক্রিয়ভাবে binding ক্লাস তৈরি করে। `findViewById()` এর নিরাপদ বিকল্প।

```kotlin
// Activity-তে ViewBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // এখন binding.viewId দিয়ে সরাসরি অ্যাক্সেস
        binding.tvTitle.text = "স্বাগতম!"
        binding.btnSubmit.setOnClickListener {
            val name = binding.etName.text.toString()
            binding.tvResult.text = "নাম: $name"
        }
    }
}

// Fragment-তে ViewBinding (মেমোরি লিক এড়াতে null করুন)
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvName.text = "করিম"
        binding.tvEmail.text = "karim@email.com"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null  // গুরুত্বপূর্ণ!
    }
}
```

---

## XML উইজেট সমূহ

### TextView
```xml
<TextView
    android:id="@+id/tvSample"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/sample_text"
    android:textSize="18sp"
    android:textColor="@color/primary"
    android:textStyle="bold|italic"
    android:fontFamily="@font/hind_siliguri"
    android:maxLines="3"
    android:ellipsize="end"
    android:lineSpacingMultiplier="1.4"
    android:letterSpacing="0.05"
    android:gravity="center"
    android:drawableStart="@drawable/ic_info"
    android:drawablePadding="8dp"/>
```

```kotlin
// কোডে টেক্সট স্টাইলিং
val spannable = SpannableStringBuilder("আমি বাংলায় লিখি")
spannable.setSpan(ForegroundColorSpan(Color.RED), 3, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
spannable.setSpan(StyleSpan(Typeface.BOLD), 3, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
binding.tvSample.text = spannable
```

### EditText (TextInputLayout)
```xml
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/tilEmail"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="ইমেইল ঠিকানা"
    app:startIconDrawable="@drawable/ic_email"
    app:endIconMode="clear_text"
    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox.Dense">

    <com.google.android.material.textfield.TextInputEditText
        android:id="@+id/etEmail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textEmailAddress"
        android:imeOptions="actionNext"/>

</com.google.android.material.textfield.TextInputLayout>
```

```kotlin
// ভ্যালিডেশন
val email = binding.etEmail.text.toString()
if (email.isEmpty()) {
    binding.tilEmail.error = "ইমেইল প্রয়োজন"
} else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
    binding.tilEmail.error = "বৈধ ইমেইল দিন"
} else {
    binding.tilEmail.error = null
    binding.tilEmail.isErrorEnabled = false
}
```

### ImageView
```xml
<ImageView
    android:id="@+id/ivProduct"
    android:layout_width="match_parent"
    android:layout_height="200dp"
    android:scaleType="centerCrop"
    android:src="@drawable/placeholder"
    android:contentDescription="পণ্যের ছবি"/>
```

```kotlin
// Coil দিয়ে ছবি লোড করা
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation

binding.ivProduct.load("https://example.com/image.jpg") {
    placeholder(R.drawable.ic_placeholder)
    error(R.drawable.ic_error)
    crossfade(500)
    transformations(RoundedCornersTransformation(16f))
}

// গোলাকার প্রোফাইল ছবি
binding.ivAvatar.load(userAvatarUrl) {
    transformations(CircleCropTransformation())
}
```

### Buttons ও অন্যান্য
```xml
<!-- Material Button -->
<com.google.android.material.button.MaterialButton
    android:id="@+id/btnSubmit"
    android:layout_width="match_parent"
    android:layout_height="52dp"
    android:text="জমা দিন"
    android:textSize="16sp"
    app:cornerRadius="8dp"
    app:icon="@drawable/ic_send"
    app:iconGravity="textStart"/>

<!-- Outlined Button -->
<com.google.android.material.button.MaterialButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="বাতিল"
    style="@style/Widget.MaterialComponents.Button.OutlinedButton"/>

<!-- Chip -->
<com.google.android.material.chip.Chip
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="ফল"
    app:chipIcon="@drawable/ic_fruit"
    app:closeIconVisible="true"
    style="@style/Widget.MaterialComponents.Chip.Filter"/>

<!-- CheckBox -->
<CheckBox
    android:id="@+id/cbAgree"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="আমি শর্তাবলীতে সম্মত"/>

<!-- Switch -->
<com.google.android.material.switchmaterial.SwitchMaterial
    android:id="@+id/switchNotification"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="নোটিফিকেশন"/>

<!-- Slider -->
<com.google.android.material.slider.Slider
    android:id="@+id/sliderPrice"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:valueFrom="0"
    android:valueTo="10000"
    android:stepSize="100"/>
```

---

## Menu ও ActionBar

### Menu XML
```xml
<!-- res/menu/main_menu.xml -->
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <item
        android:id="@+id/menuSearch"
        android:title="খুঁজুন"
        android:icon="@drawable/ic_search"
        app:showAsAction="ifRoom|collapseActionView"
        app:actionViewClass="androidx.appcompat.widget.SearchView"/>

    <item
        android:id="@+id/menuFilter"
        android:title="ফিল্টার"
        android:icon="@drawable/ic_filter"
        app:showAsAction="ifRoom"/>

    <item
        android:id="@+id/menuSettings"
        android:title="সেটিংস"
        app:showAsAction="never"/>

    <item
        android:id="@+id/menuLogout"
        android:title="লগ আউট"
        app:showAsAction="never"/>
</menu>
```

```kotlin
// Activity-তে মেনু
class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        // SearchView সেটআপ
        val searchItem = menu.findItem(R.id.menuSearch)
        val searchView = searchItem.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let { viewModel.search(it) }
                return true
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let { viewModel.search(it) }
                return true
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuFilter -> {
                showFilterDialog()
                true
            }
            R.id.menuSettings -> {
                startActivity(Intent(this, SettingsActivity::class.java))
                true
            }
            R.id.menuLogout -> {
                showLogoutConfirmation()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
```

### Bottom Navigation
```xml
<!-- activity_main.xml -->
<com.google.android.material.bottomnavigation.BottomNavigationView
    android:id="@+id/bottomNav"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:menu="@menu/bottom_nav_menu"/>
```

```xml
<!-- res/menu/bottom_nav_menu.xml -->
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/navHome" android:title="হোম" android:icon="@drawable/ic_home"/>
    <item android:id="@+id/navSearch" android:title="খুঁজুন" android:icon="@drawable/ic_search"/>
    <item android:id="@+id/navCart" android:title="কার্ট" android:icon="@drawable/ic_cart"/>
    <item android:id="@+id/navProfile" android:title="প্রোফাইল" android:icon="@drawable/ic_person"/>
</menu>
```

```kotlin
binding.bottomNav.setOnItemSelectedListener { menuItem ->
    when (menuItem.itemId) {
        R.id.navHome -> { loadFragment(HomeFragment()); true }
        R.id.navSearch -> { loadFragment(SearchFragment()); true }
        R.id.navCart -> { loadFragment(CartFragment()); true }
        R.id.navProfile -> { loadFragment(ProfileFragment()); true }
        else -> false
    }
}
```

---

## Dialog ও Toast

```kotlin
// Toast
Toast.makeText(this, "সফলভাবে সংরক্ষিত!", Toast.LENGTH_SHORT).show()

// AlertDialog
AlertDialog.Builder(this)
    .setTitle("নিশ্চিত করুন")
    .setMessage("আপনি কি এই পণ্যটি মুছতে চান?")
    .setPositiveButton("হ্যাঁ") { dialog, _ ->
        viewModel.deleteProduct(productId)
        dialog.dismiss()
    }
    .setNegativeButton("না") { dialog, _ -> dialog.dismiss() }
    .setNeutralButton("পরে") { dialog, _ -> dialog.dismiss() }
    .setCancelable(false)
    .show()

// Custom Dialog
class FilterDialog(context: Context, private val onApply: (String) -> Unit) :
    AlertDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DialogFilterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener {
            onApply(binding.etFilter.text.toString())
            dismiss()
        }
    }
}

// BottomSheetDialogFragment
class OptionBottomSheet : BottomSheetDialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = BottomSheetOptionBinding.inflate(inflater, container, false)
        binding.tvCamera.setOnClickListener { openCamera(); dismiss() }
        binding.tvGallery.setOnClickListener { openGallery(); dismiss() }
        return binding.root
    }
}

// Snackbar
Snackbar.make(binding.root, "পণ্য কার্টে যোগ হয়েছে", Snackbar.LENGTH_LONG)
    .setAction("পূর্বাবস্থা") { viewModel.removeFromCart(productId) }
    .setBackgroundTint(ContextCompat.getColor(this, R.color.primary))
    .show()
```

---

## Styles ও Themes

```xml
<!-- res/values/themes.xml -->
<resources xmlns:tools="http://schemas.android.com/tools">

    <style name="Theme.MyApp" parent="Theme.Material3.DayNight.NoActionBar">
        <item name="colorPrimary">@color/md_theme_primary</item>
        <item name="colorOnPrimary">@color/md_theme_on_primary</item>
        <item name="colorPrimaryContainer">@color/md_theme_primary_container</item>
        <item name="colorSecondary">@color/md_theme_secondary</item>
        <item name="colorSurface">@color/md_theme_surface</item>
        <item name="colorBackground">@color/md_theme_background</item>

        <!-- Typography -->
        <item name="textAppearanceHeadlineLarge">@style/TextAppearance.MyApp.HeadlineLarge</item>
        <item name="textAppearanceBodyMedium">@style/TextAppearance.MyApp.BodyMedium</item>
    </style>

    <!-- কাস্টম স্টাইল -->
    <style name="Widget.MyApp.Button.Primary" parent="Widget.Material3.Button">
        <item name="android:paddingHorizontal">24dp</item>
        <item name="android:textSize">16sp</item>
        <item name="cornerRadius">12dp</item>
    </style>

    <style name="Widget.MyApp.Card" parent="Widget.Material3.CardView.Elevated">
        <item name="cardCornerRadius">16dp</item>
        <item name="cardElevation">4dp</item>
        <item name="contentPadding">12dp</item>
    </style>

    <style name="TextAppearance.MyApp.HeadlineLarge" parent="TextAppearance.Material3.HeadlineLarge">
        <item name="fontFamily">@font/hind_siliguri</item>
        <item name="android:textSize">32sp</item>
        <item name="android:fontWeight">700</item>
    </style>

</resources>
```

---

# তৃতীয় ভাগ – Jetpack Compose

## Jetpack Compose পরিচিতি

### Compose কী?
Jetpack Compose হলো Android-এর আধুনিক ডিক্লারেটিভ UI টুলকিট। XML এর পরিবর্তে Kotlin কোড দিয়ে UI তৈরি করা হয়।

### Compose বনাম XML

```kotlin
// XML পদ্ধতি (Imperative)
textView.text = "স্বাগতম"
button.setOnClickListener { textView.text = "ক্লিক হয়েছে" }

// Compose পদ্ধতি (Declarative)
var text by remember { mutableStateOf("স্বাগতম") }
Text(text = text)
Button(onClick = { text = "ক্লিক হয়েছে" }) { Text("ক্লিক") }
```

### Compose সেটআপ (build.gradle.kts)
```kotlin
android {
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.8" }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.01.00")
    implementation(composeBom)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.8.2")
    debugImplementation("androidx.compose.ui:ui-tooling")
}
```

---

## Composable ফাংশন

### Composable কী?
`@Composable` অ্যানোটেশন দেওয়া ফাংশন। এটি UI তৈরি করে, মান রিটার্ন করে না।

```kotlin
// সহজ Composable
@Composable
fun Greeting(name: String) {
    Text(text = "স্বাগতম, $name!")
}

// প্যারামিটার সহ
@Composable
fun ProfileCard(
    name: String,
    email: String,
    avatarUrl: String,
    onEditClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = avatarUrl,
                contentDescription = "প্রোফাইল ছবি",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                Text(text = email, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.outline)
            }
            IconButton(onClick = onEditClick) {
                Icon(Icons.Default.Edit, contentDescription = "সম্পাদনা")
            }
        }
    }
}

// Preview
@Preview(showBackground = true, name = "প্রোফাইল কার্ড")
@Composable
fun ProfileCardPreview() {
    MaterialTheme {
        ProfileCard(
            name = "করিম সাহেব",
            email = "karim@email.com",
            avatarUrl = "",
            onEditClick = {}
        )
    }
}
```

### Modifier
```kotlin
// Modifier চেইনিং
Box(
    modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .padding(16.dp)
        .background(Color.Blue, RoundedCornerShape(12.dp))
        .border(2.dp, Color.White, RoundedCornerShape(12.dp))
        .clickable { /* ক্লিক */ }
        .semantics { contentDescription = "নীল বক্স" }
)

// Modifier.then() দিয়ে শর্তসাপেক্ষ
@Composable
fun ConditionalCard(isSelected: Boolean) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .then(
                if (isSelected) Modifier.border(2.dp, Color.Blue, RoundedCornerShape(8.dp))
                else Modifier
            )
    ) { /* ... */ }
}
```

---

## Compose লেআউট

### Column, Row, Box
```kotlin
@Composable
fun LayoutExamples() {
    // Column – উল্লম্ব
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("প্রথম")
        Text("দ্বিতীয়")
        Text("তৃতীয়")
    }

    // Row – আনুভূমিক
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.Star, contentDescription = null, tint = Color.Amber)
        Text("রেটিং: ৪.৫")
        Button(onClick = {}) { Text("কিনুন") }
    }

    // Box – উপরে রাখা
    Box(contentAlignment = Alignment.Center) {
        Image(painter = painterResource(R.drawable.bg), contentDescription = null, modifier = Modifier.fillMaxSize())
        Text("উপরে টেক্সট", color = Color.White, fontSize = 24.sp)
        // নির্দিষ্ট কোণে
        Badge(
            modifier = Modifier.align(Alignment.TopEnd).padding(8.dp)
        ) { Text("৩") }
    }
}
```

### Scaffold
```kotlin
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("আমার অ্যাপ") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, "পেছনে যান")
                    }
                },
                actions = {
                    IconButton(onClick = { /* সার্চ */ }) {
                        Icon(Icons.Default.Search, "খুঁজুন")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        bottomBar = {
            NavigationBar {
                listOf("হোম" to Icons.Default.Home, "প্রোফাইল" to Icons.Default.Person).forEach { (label, icon) ->
                    NavigationBarItem(
                        selected = false,
                        onClick = {},
                        icon = { Icon(icon, label) },
                        label = { Text(label) }
                    )
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* যোগ করুন */ }) {
                Icon(Icons.Default.Add, "যোগ করুন")
            }
        },
        snackbarHost = { SnackbarHost(SnackbarHostState()) }
    ) { paddingValues ->
        // বিষয়বস্তু
        Column(modifier = Modifier.padding(paddingValues)) {
            /* ... */
        }
    }
}
```

### ConstraintLayout in Compose
```kotlin
implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
```

```kotlin
@Composable
fun ConstraintExample() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (image, title, subtitle, button) = createRefs()

        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = null,
            modifier = Modifier.constrainAs(image) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Text(
            text = "পণ্যের নাম",
            modifier = Modifier.constrainAs(title) {
                top.linkTo(image.bottom, 16.dp)
                start.linkTo(parent.start, 16.dp)
            }
        )
    }
}
```

---

## Compose উইজেট

### Text ও Button
```kotlin
@Composable
fun TextExamples() {
    // সাধারণ Text
    Text(
        text = "স্বাগতম!",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary,
        textAlign = TextAlign.Center,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.headlineLarge
    )

    // মিশ্র স্টাইল
    Text(
        buildAnnotatedString {
            append("এটি ")
            withStyle(SpanStyle(color = Color.Red, fontWeight = FontWeight.Bold)) {
                append("লাল")
            }
            append(" ও এটি ")
            withStyle(SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
                append("নীল")
            }
            append(" টেক্সট।")
        }
    )

    // নির্বাচনযোগ্য টেক্সট
    SelectionContainer {
        Text("এটি কপি করা যাবে")
    }
}

@Composable
fun ButtonExamples() {
    // Filled Button
    Button(
        onClick = { },
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
    ) {
        Icon(Icons.Default.ShoppingCart, contentDescription = null)
        Spacer(Modifier.width(4.dp))
        Text("কার্টে যোগ করুন")
    }

    // Outlined Button
    OutlinedButton(onClick = { }) { Text("বাতিল") }

    // Text Button
    TextButton(onClick = { }) { Text("আরও জানুন") }

    // Icon Button
    IconButton(onClick = { }) {
        Icon(Icons.Default.Favorite, contentDescription = "পছন্দ")
    }

    // FAB
    FloatingActionButton(onClick = { }) {
        Icon(Icons.Default.Add, contentDescription = "যোগ")
    }

    ExtendedFloatingActionButton(
        onClick = { },
        icon = { Icon(Icons.Default.Add, null) },
        text = { Text("নতুন পণ্য") }
    )
}
```

### TextField
```kotlin
@Composable
fun TextFieldExamples() {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var nameError by remember { mutableStateOf<String?>(null) }

    // OutlinedTextField
    OutlinedTextField(
        value = name,
        onValueChange = {
            name = it
            nameError = if (it.isEmpty()) "নাম প্রয়োজন" else null
        },
        label = { Text("নাম") },
        placeholder = { Text("আপনার পুরো নাম") },
        leadingIcon = { Icon(Icons.Default.Person, null) },
        trailingIcon = {
            if (name.isNotEmpty()) {
                IconButton(onClick = { name = "" }) {
                    Icon(Icons.Default.Clear, null)
                }
            }
        },
        isError = nameError != null,
        supportingText = { nameError?.let { Text(it, color = MaterialTheme.colorScheme.error) } },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next
        ),
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )

    // পাসওয়ার্ড ফিল্ড
    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("পাসওয়ার্ড") },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                    contentDescription = null
                )
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done),
        modifier = Modifier.fillMaxWidth()
    )
}
```

### Image ও Icon
```kotlin
@Composable
fun ImageExamples() {
    // Resource থেকে
    Image(
        painter = painterResource(R.drawable.logo),
        contentDescription = "লোগো",
        modifier = Modifier.size(100.dp),
        contentScale = ContentScale.Fit
    )

    // নেটওয়ার্ক থেকে (Coil)
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data("https://example.com/image.jpg")
            .crossfade(true)
            .build(),
        contentDescription = "পণ্যের ছবি",
        placeholder = painterResource(R.drawable.placeholder),
        error = painterResource(R.drawable.error),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(12.dp))
    )

    // গোলাকার প্রোফাইল ছবি
    AsyncImage(
        model = avatarUrl,
        contentDescription = "প্রোফাইল",
        modifier = Modifier
            .size(60.dp)
            .clip(CircleShape)
            .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape),
        contentScale = ContentScale.Crop
    )

    // আইকন
    Icon(Icons.Default.Home, contentDescription = "হোম", tint = Color.Blue, modifier = Modifier.size(24.dp))
    Icon(Icons.Outlined.FavoriteBorder, contentDescription = null)
    Icon(painterResource(R.drawable.ic_custom), contentDescription = null)
}
```

### Checkbox, Switch, RadioButton, Slider
```kotlin
@Composable
fun SelectionWidgets() {
    var checked by remember { mutableStateOf(false) }
    var switchState by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("পুরুষ") }
    var sliderValue by remember { mutableStateOf(0f) }

    // Checkbox
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = checked, onCheckedChange = { checked = it })
        Spacer(Modifier.width(8.dp))
        Text("আমি শর্তাবলীতে সম্মত")
    }

    // Switch
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
        Text("নোটিফিকেশন", modifier = Modifier.weight(1f))
        Switch(checked = switchState, onCheckedChange = { switchState = it })
    }

    // RadioButton
    listOf("পুরুষ", "মহিলা", "অন্যান্য").forEach { option ->
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable { selectedOption = option }) {
            RadioButton(selected = selectedOption == option, onClick = { selectedOption = option })
            Text(option)
        }
    }

    // Slider
    Column {
        Text("মূল্য সীমা: ৳${sliderValue.toInt()}")
        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            valueRange = 0f..10000f,
            steps = 9,
            modifier = Modifier.fillMaxWidth()
        )
    }
}
```

### Card, Divider, ProgressBar
```kotlin
@Composable
fun OtherWidgets() {
    // Card
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("কার্ড শিরোনাম", style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.height(8.dp))
            Text("কার্ডের বিষয়বস্তু এখানে", style = MaterialTheme.typography.bodyMedium)
        }
    }

    // Divider
    HorizontalDivider(thickness = 1.dp, color = MaterialTheme.colorScheme.outlineVariant)

    // CircularProgressIndicator
    CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)

    // LinearProgressIndicator
    LinearProgressIndicator(modifier = Modifier.fillMaxWidth())

    // নির্ধারিত অগ্রগতি
    LinearProgressIndicator(progress = { 0.7f }, modifier = Modifier.fillMaxWidth())

    // Badge
    BadgedBox(badge = { Badge { Text("৫") } }) {
        Icon(Icons.Default.ShoppingCart, contentDescription = null)
    }
}
```

---

## State in Compose

### remember ও mutableStateOf
```kotlin
@Composable
fun StateExamples() {
    // সহজ state
    var count by remember { mutableStateOf(0) }

    // জটিল state
    var user by remember { mutableStateOf(User(name = "", email = "")) }

    // List state
    val items = remember { mutableStateListOf("এক", "দুই", "তিন") }

    // Map state
    val map = remember { mutableStateMapOf<String, Boolean>() }

    Column {
        Text("গণনা: $count")
        Button(onClick = { count++ }) { Text("বাড়ান") }
        Button(onClick = { count-- }) { Text("কমান") }
        Button(onClick = { count = 0 }) { Text("রিসেট") }

        // List পরিবর্তন
        Button(onClick = { items.add("চার") }) { Text("যোগ করুন") }
        items.forEach { item -> Text(item) }
    }
}
```

### State Hoisting
```kotlin
// State উপরে নিয়ে যাওয়া – stateless ও reusable উইজেট
@Composable
fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,  // state বাইরে
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = query,
        onValueChange = onQueryChange,
        label = { Text("খুঁজুন") },
        leadingIcon = { Icon(Icons.Default.Search, null) },
        modifier = modifier.fillMaxWidth()
    )
}

// Parent-এ state রাখা
@Composable
fun SearchScreen() {
    var searchQuery by remember { mutableStateOf("") }

    Column {
        SearchBar(
            query = searchQuery,
            onQueryChange = { searchQuery = it }
        )
        // searchQuery ব্যবহার করে ফলাফল দেখান
        SearchResults(query = searchQuery)
    }
}
```

### rememberSaveable (কনফিগারেশন পরিবর্তনে টিকে থাকে)
```kotlin
@Composable
fun SurvivalExample() {
    // স্ক্রিন ঘোরালেও টিকে থাকে
    var name by rememberSaveable { mutableStateOf("") }
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }

    TextField(value = name, onValueChange = { name = it })
}
```

### derivedStateOf
```kotlin
@Composable
fun DerivedExample() {
    var items by remember { mutableStateOf(listOf(1, 2, 3, 4, 5, 6)) }
    var filter by remember { mutableStateOf("") }

    // items বা filter পরিবর্তে পুনর্গণনা হয়
    val filteredItems by remember {
        derivedStateOf { items.filter { it.toString().contains(filter) } }
    }

    Column {
        TextField(value = filter, onValueChange = { filter = it })
        filteredItems.forEach { Text(it.toString()) }
    }
}
```

---

## LazyList ও LazyGrid

### LazyColumn (RecyclerView এর বিকল্প)
```kotlin
@Composable
fun ProductListScreen(viewModel: ProductViewModel = viewModel()) {
    val products by viewModel.products.collectAsState()
    val listState = rememberLazyListState()

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            state = listState,
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Header
            item {
                Text("পণ্যসমূহ", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(vertical = 8.dp))
            }

            // আইটেম তালিকা
            items(products, key = { it.id }) { product ->
                ProductCard(product = product, modifier = Modifier.animateItemPlacement())
            }

            // Loading indicator
            item {
                if (viewModel.isLoading) {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator()
                    }
                }
            }
        }

        // উপরে স্ক্রল বাটন
        val showScrollToTop by remember { derivedStateOf { listState.firstVisibleItemIndex > 0 } }
        if (showScrollToTop) {
            val coroutineScope = rememberCoroutineScope()
            FloatingActionButton(
                onClick = { coroutineScope.launch { listState.animateScrollToItem(0) } },
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)
            ) {
                Icon(Icons.Default.KeyboardArrowUp, "উপরে যান")
            }
        }
    }
}

// Pull to Refresh সহ
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RefreshableList(viewModel: ProductViewModel = viewModel()) {
    val isRefreshing by viewModel.isRefreshing.collectAsState()
    val pullRefreshState = rememberPullToRefreshState()

    PullToRefreshBox(
        isRefreshing = isRefreshing,
        onRefresh = { viewModel.refresh() },
        state = pullRefreshState
    ) {
        LazyColumn { /* ... */ }
    }
}
```

### LazyGrid
```kotlin
@Composable
fun ProductGridScreen(products: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),           // নির্দিষ্ট কলাম
        // columns = GridCells.Adaptive(160.dp),  // অভিযোজিত
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // পুরো প্রস্থে header
        item(span = { GridItemSpan(maxLineSpan) }) {
            Text("পণ্য গ্রিড", modifier = Modifier.padding(8.dp))
        }

        items(products, key = { it.id }) { product ->
            ProductGridItem(product = product)
        }
    }
}
```

---

## Compose Navigation

```kotlin
// build.gradle.kts
implementation("androidx.navigation:navigation-compose:2.7.6")
```

```kotlin
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// রাউট কনস্ট্যান্ট
object Routes {
    const val HOME = "home"
    const val PRODUCT_LIST = "products"
    const val PRODUCT_DETAIL = "product/{id}"
    const val CART = "cart"
    const val PROFILE = "profile"

    fun productDetail(id: Int) = "product/$id"
}

// Main Navigation
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { AppBottomBar(navController) }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = Routes.HOME,
            modifier = Modifier.padding(padding)
        ) {
            composable(Routes.HOME) {
                HomeScreen(navController = navController)
            }

            composable(Routes.PRODUCT_LIST) {
                ProductListScreen(
                    onProductClick = { id -> navController.navigate(Routes.productDetail(id)) }
                )
            }

            composable(
                route = Routes.PRODUCT_DETAIL,
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) { backStackEntry ->
                val id = backStackEntry.arguments?.getInt("id") ?: return@composable
                ProductDetailScreen(productId = id, navController = navController)
            }

            composable(Routes.CART) { CartScreen() }
            composable(Routes.PROFILE) { ProfileScreen() }
        }
    }
}

// Bottom Navigation Bar
@Composable
fun AppBottomBar(navController: NavController) {
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    NavigationBar {
        listOf(
            Triple(Routes.HOME, Icons.Default.Home, "হোম"),
            Triple(Routes.PRODUCT_LIST, Icons.Default.ShoppingBag, "পণ্য"),
            Triple(Routes.CART, Icons.Default.ShoppingCart, "কার্ট"),
            Triple(Routes.PROFILE, Icons.Default.Person, "প্রোফাইল")
        ).forEach { (route, icon, label) ->
            NavigationBarItem(
                selected = currentRoute == route,
                onClick = {
                    navController.navigate(route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(icon, label) },
                label = { Text(label) }
            )
        }
    }
}
```

---

## Compose Theme ও Material 3

```kotlin
// ui/theme/Theme.kt
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF006E2C),
    onPrimary = Color.White,
    primaryContainer = Color(0xFF9CF6A4),
    secondary = Color(0xFF516350),
    surface = Color(0xFFFCFDF7),
    background = Color(0xFFFCFDF7),
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF81D98A),
    onPrimary = Color(0xFF003913),
    primaryContainer = Color(0xFF005320),
    secondary = Color(0xFFB5CCB3),
    surface = Color(0xFF1A1C19),
    background = Color(0xFF1A1C19),
)

@Composable
fun MyAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,  // Android 12+ ডায়নামিক রঙ
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}

// Typography
val AppTypography = Typography(
    headlineLarge = TextStyle(fontFamily = HindSiliguriFamily, fontWeight = FontWeight.Bold, fontSize = 32.sp),
    headlineMedium = TextStyle(fontFamily = HindSiliguriFamily, fontWeight = FontWeight.SemiBold, fontSize = 24.sp),
    bodyLarge = TextStyle(fontFamily = HindSiliguriFamily, fontSize = 16.sp),
    bodyMedium = TextStyle(fontFamily = HindSiliguriFamily, fontSize = 14.sp),
    labelSmall = TextStyle(fontFamily = HindSiliguriFamily, fontSize = 11.sp)
)
```

---

## Compose অ্যানিমেশন

### সহজ অ্যানিমেশন
```kotlin
@Composable
fun SimpleAnimations() {
    var expanded by remember { mutableStateOf(false) }

    // AnimatedVisibility
    AnimatedVisibility(
        visible = expanded,
        enter = fadeIn() + slideInVertically(),
        exit = fadeOut() + slideOutVertically()
    ) {
        Card { Text("এটি অদৃশ্য/দৃশ্যমান হয়!") }
    }

    // animateContentSize
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(animationSpec = tween(300))
    ) {
        Column {
            Text("ক্লিক করুন", modifier = Modifier.clickable { expanded = !expanded })
            if (expanded) {
                Text("এটি প্রসারিত বিষয়বস্তু...")
                Text("আরও বিষয়বস্তু...")
            }
        }
    }

    // animate*AsState
    val size by animateDpAsState(targetValue = if (expanded) 200.dp else 100.dp, label = "size")
    val color by animateColorAsState(targetValue = if (expanded) Color.Blue else Color.Red, label = "color")

    Box(modifier = Modifier.size(size).background(color))
}
```

### Crossfade ও AnimatedContent
```kotlin
@Composable
fun LoadingScreen(isLoading: Boolean, content: @Composable () -> Unit) {
    Crossfade(targetState = isLoading, label = "loading") { loading ->
        if (loading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        } else {
            content()
        }
    }
}

// AnimatedContent
@Composable
fun CounterWithAnimation() {
    var count by remember { mutableIntStateOf(0) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AnimatedContent(
            targetState = count,
            transitionSpec = {
                if (targetState > initialState) {
                    slideInVertically { -it } + fadeIn() togetherWith slideOutVertically { it } + fadeOut()
                } else {
                    slideInVertically { it } + fadeIn() togetherWith slideOutVertically { -it } + fadeOut()
                }
            },
            label = "counter"
        ) { targetCount ->
            Text("$targetCount", style = MaterialTheme.typography.displayLarge)
        }
        Row {
            Button(onClick = { count-- }) { Text("-") }
            Spacer(Modifier.width(16.dp))
            Button(onClick = { count++ }) { Text("+") }
        }
    }
}
```

---

# চতুর্থ ভাগ – Architecture ও Jetpack

## MVVM আর্কিটেকচার

### MVVM কী?
Model-View-ViewModel প্যাটার্ন Android-এর সুপারিশকৃত আর্কিটেকচার।

```
┌─────────────────────────────────────────┐
│                  View                    │
│      (Activity/Fragment/Composable)      │
│   ← পর্যবেক্ষণ করে (observe)            │
└────────────────┬────────────────────────┘
                 │ ব্যবহার করে (use)
┌────────────────▼────────────────────────┐
│               ViewModel                  │
│   - UI লজিক                             │
│   - LiveData/StateFlow                   │
└────────────────┬────────────────────────┘
                 │ কল করে (call)
┌────────────────▼────────────────────────┐
│              Repository                  │
│   - ডেটা উৎস নির্বাচন                  │
└──────┬──────────────────┬───────────────┘
       │                  │
┌──────▼──────┐   ┌───────▼───────┐
│  Room DB    │   │  Retrofit API  │
│  (লোকাল)   │   │   (রিমোট)     │
└─────────────┘   └───────────────┘
```

### Clean Architecture
```
data/
├── local/
│   ├── ProductDao.kt
│   └── AppDatabase.kt
├── remote/
│   ├── ApiService.kt
│   └── dto/
│       └── ProductDto.kt
├── repository/
│   └── ProductRepositoryImpl.kt
└── model/
    └── Product.kt

domain/
├── model/
│   └── Product.kt
├── repository/
│   └── ProductRepository.kt   (interface)
└── usecase/
    ├── GetProductsUseCase.kt
    └── AddToCartUseCase.kt

presentation/
├── viewmodel/
│   └── ProductViewModel.kt
└── ui/
    └── ProductListFragment.kt
```

---

## ViewModel

```kotlin
class ProductViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
    private val addToCartUseCase: AddToCartUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    // StateFlow – Compose-এ ব্যবহারের জন্য
    private val _uiState = MutableStateFlow(ProductUiState())
    val uiState: StateFlow<ProductUiState> = _uiState.asStateFlow()

    // LiveData – XML-এ ব্যবহারের জন্য
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products

    // SavedStateHandle – প্রক্রিয়া মৃত্যুতেও টিকে থাকে
    val searchQuery = savedStateHandle.getStateFlow("search", "")

    init {
        loadProducts()
    }

    fun loadProducts() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            try {
                val result = getProductsUseCase()
                _uiState.update { it.copy(isLoading = false, products = result) }
            } catch (e: Exception) {
                _uiState.update { it.copy(isLoading = false, error = e.message) }
            }
        }
    }

    fun search(query: String) {
        savedStateHandle["search"] = query
        viewModelScope.launch {
            val filtered = getProductsUseCase(query)
            _uiState.update { it.copy(products = filtered) }
        }
    }

    fun addToCart(product: Product) {
        viewModelScope.launch {
            addToCartUseCase(product)
            _uiState.update { state ->
                state.copy(message = "${product.name} কার্টে যোগ হয়েছে")
            }
        }
    }

    fun messageShown() {
        _uiState.update { it.copy(message = null) }
    }
}

// UI State ডেটা ক্লাস
data class ProductUiState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null,
    val message: String? = null
)
```

---

## LiveData ও StateFlow

### LiveData (XML-এ)
```kotlin
class OrderViewModel : ViewModel() {
    private val _orderStatus = MutableLiveData<OrderStatus>()
    val orderStatus: LiveData<OrderStatus> = _orderStatus

    // Transformation
    val orderStatusText: LiveData<String> = Transformations.map(orderStatus) { status ->
        when (status) {
            OrderStatus.PENDING -> "অপেক্ষারত"
            OrderStatus.CONFIRMED -> "নিশ্চিত"
            OrderStatus.DELIVERED -> "বিতরিত"
            else -> "অজানা"
        }
    }

    // MediatorLiveData – একাধিক উৎস একত্রিত
    private val _searchQuery = MutableLiveData<String>()
    private val _allProducts = MutableLiveData<List<Product>>()

    val filteredProducts = MediatorLiveData<List<Product>>().apply {
        addSource(_searchQuery) { query -> value = filterProducts(query, _allProducts.value) }
        addSource(_allProducts) { products -> value = filterProducts(_searchQuery.value, products) }
    }
}

// Fragment-এ LiveData পর্যবেক্ষণ
viewModel.orderStatus.observe(viewLifecycleOwner) { status ->
    binding.tvStatus.text = status.displayName
}

viewModel.products.observe(viewLifecycleOwner) { products ->
    adapter.submitList(products)
}
```

### StateFlow ও SharedFlow (Compose-এ)
```kotlin
class NotificationViewModel : ViewModel() {
    // StateFlow – বর্তমান মান ধরে রাখে
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count.asStateFlow()

    // SharedFlow – ইভেন্টের জন্য, পুরানো মান ধরে না
    private val _events = MutableSharedFlow<UiEvent>()
    val events: SharedFlow<UiEvent> = _events.asSharedFlow()

    fun increment() { _count.update { it + 1 } }

    fun showError(message: String) {
        viewModelScope.launch { _events.emit(UiEvent.ShowError(message)) }
    }
}

// Composable-এ collect
@Composable
fun NotificationScreen(viewModel: NotificationViewModel = viewModel()) {
    val count by viewModel.count.collectAsStateWithLifecycle()
    val lifecycleOwner = LocalLifecycleOwner.current

    LaunchedEffect(lifecycleOwner) {
        lifecycleOwner.lifecycleScope.launch {
            viewModel.events.collect { event ->
                when (event) {
                    is UiEvent.ShowError -> { /* স্ন্যাকবার দেখান */ }
                }
            }
        }
    }

    Text("নোটিফিকেশন: $count")
}
```

---

## Room Database

### Entity, DAO, Database
```kotlin
// Entity – ডেটাবেজ টেবিল
@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "product_name") val name: String,
    val price: Double,
    val category: String,
    val imageUrl: String,
    @ColumnInfo(defaultValue = "0") val isFavorite: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)

// DAO – ডেটাবেজ অপারেশন
@Dao
interface ProductDao {
    // সব পণ্য পড়া (Flow দিয়ে রিয়েলটাইম)
    @Query("SELECT * FROM products ORDER BY product_name ASC")
    fun getAllProducts(): Flow<List<ProductEntity>>

    // ক্যাটাগরি দিয়ে ফিল্টার
    @Query("SELECT * FROM products WHERE category = :category")
    fun getByCategory(category: String): Flow<List<ProductEntity>>

    // একটি পণ্য পড়া
    @Query("SELECT * FROM products WHERE id = :id")
    suspend fun getById(id: Int): ProductEntity?

    // যোগ করা/আপডেট করা
    @Upsert
    suspend fun upsert(product: ProductEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(products: List<ProductEntity>)

    // আপডেট
    @Update
    suspend fun update(product: ProductEntity)

    // মুছে ফেলা
    @Delete
    suspend fun delete(product: ProductEntity)

    @Query("DELETE FROM products WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("DELETE FROM products")
    suspend fun deleteAll()

    // পছন্দের টগল
    @Query("UPDATE products SET isFavorite = NOT isFavorite WHERE id = :id")
    suspend fun toggleFavorite(id: Int)

    // গণনা
    @Query("SELECT COUNT(*) FROM products")
    suspend fun count(): Int

    // সার্চ
    @Query("SELECT * FROM products WHERE product_name LIKE '%' || :query || '%'")
    fun search(query: String): Flow<List<ProductEntity>>
}

// Database
@Database(
    entities = [ProductEntity::class, CartItemEntity::class, UserEntity::class],
    version = 2,
    exportSchema = true
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
    abstract fun cartDao(): CartDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(context, AppDatabase::class.java, "app_database")
                    .addMigrations(MIGRATION_1_2)
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { INSTANCE = it }
            }
        }
    }
}

// Migration
val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE products ADD COLUMN isFavorite INTEGER NOT NULL DEFAULT 0")
    }
}

// TypeConverter
class Converters {
    @TypeConverter
    fun fromStringList(value: List<String>): String = Gson().toJson(value)

    @TypeConverter
    fun toStringList(value: String): List<String> = Gson().fromJson(value, object : TypeToken<List<String>>() {}.type)
}
```

---

## Retrofit ও API

```kotlin
// API Interface
interface ProductApiService {

    @GET("products")
    suspend fun getProducts(
        @Query("category") category: String? = null,
        @Query("page") page: Int = 1,
        @Query("limit") limit: Int = 20
    ): ApiResponse<List<ProductDto>>

    @GET("products/{id}")
    suspend fun getProduct(@Path("id") id: Int): ApiResponse<ProductDto>

    @POST("products")
    suspend fun createProduct(@Body product: CreateProductRequest): ApiResponse<ProductDto>

    @PUT("products/{id}")
    suspend fun updateProduct(@Path("id") id: Int, @Body product: UpdateProductRequest): ApiResponse<ProductDto>

    @DELETE("products/{id}")
    suspend fun deleteProduct(@Path("id") id: Int): Response<Unit>

    @Multipart
    @POST("upload")
    suspend fun uploadImage(@Part image: MultipartBody.Part): ApiResponse<UploadResponse>
}

// API Response Wrapper
data class ApiResponse<T>(
    val success: Boolean,
    val data: T?,
    val message: String?,
    val errors: List<String>?
)

// Retrofit Client
object RetrofitClient {
    private const val BASE_URL = "https://api.example.com/v1/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                else HttpLoggingInterceptor.Level.NONE
    }

    private val authInterceptor = Interceptor { chain ->
        val token = TokenManager.getToken()
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer $token")
            .addHeader("Accept", "application/json")
            .addHeader("Accept-Language", "bn")
            .build()
        chain.proceed(request)
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(authInterceptor)
        .addInterceptor(loggingInterceptor)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    val instance: ProductApiService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ProductApiService::class.java)
}

// Repository Implementation
class ProductRepositoryImpl @Inject constructor(
    private val apiService: ProductApiService,
    private val productDao: ProductDao
) : ProductRepository {

    // নেটওয়ার্ক প্রথম, তারপর ক্যাশ
    override fun getProducts(): Flow<Resource<List<Product>>> = flow {
        emit(Resource.Loading())

        // ক্যাশ থেকে দেখান
        val cachedProducts = productDao.getAllProducts().first()
        if (cachedProducts.isNotEmpty()) {
            emit(Resource.Success(cachedProducts.map { it.toDomain() }))
        }

        try {
            // নেটওয়ার্ক থেকে আনুন
            val response = apiService.getProducts()
            if (response.success && response.data != null) {
                // ক্যাশ আপডেট করুন
                productDao.insertAll(response.data.map { it.toEntity() })
                emit(Resource.Success(response.data.map { it.toDomain() }))
            } else {
                emit(Resource.Error(response.message ?: "অজানা ত্রুটি"))
            }
        } catch (e: IOException) {
            emit(Resource.Error("ইন্টারনেট সংযোগ নেই"))
        } catch (e: HttpException) {
            emit(Resource.Error("সার্ভার ত্রুটি: ${e.code()}"))
        }
    }
}

// Resource Sealed Class
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}
```

---

## Hilt Dependency Injection

```kotlin
// Application ক্লাস
@HiltAndroidApp
class MyApplication : Application()

// Module
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "app_db").build()
    }

    @Provides
    @Singleton
    fun provideProductDao(db: AppDatabase): ProductDao = db.productDao()

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.example.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ProductApiService {
        return retrofit.create(ProductApiService::class.java)
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindProductRepository(impl: ProductRepositoryImpl): ProductRepository
}

// ViewModel-এ Inject
@HiltViewModel
class ProductViewModel @Inject constructor(
    private val productRepository: ProductRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() { /* ... */ }

// Activity-তে
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: ProductViewModel by viewModels()
}

// Fragment-এ
@AndroidEntryPoint
class ProductListFragment : Fragment() {
    private val viewModel: ProductViewModel by viewModels()
}
```

---

## DataStore

### Preferences DataStore
```kotlin
implementation("androidx.datastore:datastore-preferences:1.0.0")
```

```kotlin
// DataStore তৈরি
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

class UserPreferencesRepository(private val dataStore: DataStore<Preferences>) {

    companion object {
        val IS_DARK_MODE = booleanPreferencesKey("is_dark_mode")
        val AUTH_TOKEN = stringPreferencesKey("auth_token")
        val USER_ID = intPreferencesKey("user_id")
        val LANGUAGE = stringPreferencesKey("language")
    }

    // পড়া (Flow)
    val isDarkMode: Flow<Boolean> = dataStore.data.map { prefs ->
        prefs[IS_DARK_MODE] ?: false
    }

    val authToken: Flow<String?> = dataStore.data.map { prefs ->
        prefs[AUTH_TOKEN]
    }

    // সংরক্ষণ
    suspend fun setDarkMode(isDark: Boolean) {
        dataStore.edit { prefs -> prefs[IS_DARK_MODE] = isDark }
    }

    suspend fun saveAuthToken(token: String) {
        dataStore.edit { prefs -> prefs[AUTH_TOKEN] = token }
    }

    suspend fun clearAll() {
        dataStore.edit { it.clear() }
    }
}
```

---

## WorkManager

```kotlin
implementation("androidx.work:work-runtime-ktx:2.9.0")
```

```kotlin
// Worker
class DataSyncWorker(context: Context, params: WorkerParameters) :
    CoroutineWorker(context, params) {

    override suspend fun doWork(): Result {
        return try {
            // ডেটা সিঙ্ক করুন
            val repo = ProductRepositoryImpl()
            repo.syncFromServer()

            // ইনপুট ডেটা
            val productId = inputData.getInt("product_id", -1)

            Result.success(workDataOf("sync_time" to System.currentTimeMillis()))
        } catch (e: Exception) {
            if (runAttemptCount < 3) Result.retry()
            else Result.failure()
        }
    }
}

// WorkManager ব্যবহার
class SyncManager(private val workManager: WorkManager) {

    fun schedulePeriodic() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .setRequiresBatteryNotLow(true)
            .build()

        val syncRequest = PeriodicWorkRequestBuilder<DataSyncWorker>(
            repeatInterval = 6,
            repeatIntervalTimeUnit = TimeUnit.HOURS
        )
            .setConstraints(constraints)
            .setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 30, TimeUnit.MINUTES)
            .addTag("sync")
            .build()

        workManager.enqueueUniquePeriodicWork(
            "data_sync",
            ExistingPeriodicWorkPolicy.UPDATE,
            syncRequest
        )
    }

    fun syncNow(productId: Int) {
        val inputData = workDataOf("product_id" to productId)

        val request = OneTimeWorkRequestBuilder<DataSyncWorker>()
            .setInputData(inputData)
            .build()

        workManager.enqueue(request)

        // অগ্রগতি পর্যবেক্ষণ
        workManager.getWorkInfoByIdLiveData(request.id).observe(lifecycleOwner) { info ->
            when (info?.state) {
                WorkInfo.State.RUNNING -> println("চলছে...")
                WorkInfo.State.SUCCEEDED -> {
                    val syncTime = info.outputData.getLong("sync_time", 0)
                    println("সম্পন্ন: $syncTime")
                }
                WorkInfo.State.FAILED -> println("ব্যর্থ")
                else -> {}
            }
        }
    }
}
```

---

## Navigation Component

### XML Navigation Graph
```xml
<!-- res/navigation/nav_graph.xml -->
<?xml version="1.0" encoding="utf-8"?>
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/nav_graph"
    app:startDestination="@id/homeFragment">

    <fragment
        android:id="@+id/homeFragment"
        android:name=".ui.HomeFragment"
        android:label="হোম">
        <action
            android:id="@+id/actionHomeToDetail"
            app:destination="@id/productDetailFragment"
            app:enterAnim="@anim/slide_in_right"
            app:exitAnim="@anim/slide_out_left"/>
    </fragment>

    <fragment
        android:id="@+id/productDetailFragment"
        android:name=".ui.ProductDetailFragment"
        android:label="পণ্যের বিবরণ">
        <argument
            android:name="productId"
            app:argType="integer"/>
        <argument
            android:name="productName"
            app:argType="string"
            android:defaultValue=""/>
    </fragment>

    <fragment
        android:id="@+id/cartFragment"
        android:name=".ui.CartFragment"/>

    <!-- গভীর লিংক -->
    <deepLink app:uri="myapp://products/{productId}"/>

</navigation>
```

```kotlin
// SafeArgs ব্যবহার (type-safe navigation)
// HomeFragment থেকে
val action = HomeFragmentDirections.actionHomeToDetail(
    productId = product.id,
    productName = product.name
)
findNavController().navigate(action)

// ProductDetailFragment-এ গ্রহণ
val args: ProductDetailFragmentArgs by navArgs()
val productId = args.productId
val productName = args.productName
```

---

# পঞ্চম ভাগ – উন্নত বিষয়

## Coroutines ও Flow

### Coroutines পরিচিতি
```kotlin
// viewModelScope – ViewModel-এর জন্য
viewModelScope.launch {
    val products = repository.getProducts()
    _products.value = products
}

// lifecycleScope – Activity/Fragment-এর জন্য
lifecycleScope.launch {
    viewModel.events.collect { event -> /* ... */ }
}

// Coroutine Context
viewModelScope.launch(Dispatchers.IO) {
    // IO-bound কাজ (নেটওয়ার্ক, ডেটাবেজ)
    val data = networkCall()
    withContext(Dispatchers.Main) {
        // UI আপডেট
        updateUI(data)
    }
}

// async/await – সমান্তরাল কাজ
viewModelScope.launch {
    val products = async(Dispatchers.IO) { repository.getProducts() }
    val categories = async(Dispatchers.IO) { repository.getCategories() }
    val user = async(Dispatchers.IO) { repository.getCurrentUser() }

    // সব শেষ হওয়ার পর
    updateUI(products.await(), categories.await(), user.await())
}

// Error handling
viewModelScope.launch {
    try {
        val result = repository.getProducts()
        _products.value = result
    } catch (e: CancellationException) {
        throw e  // CancellationException পুনরায় ছুড়ুন
    } catch (e: IOException) {
        _error.value = "নেটওয়ার্ক ত্রুটি"
    } catch (e: Exception) {
        _error.value = e.message
    }
}
```

### Flow
```kotlin
// Flow তৈরি করা
fun getProductsFlow(): Flow<List<Product>> = flow {
    while (true) {
        val products = apiService.getProducts()
        emit(products)
        delay(30_000)  // ৩০ সেকেন্ড পর আবার
    }
}

// Flow অপারেটর
repository.getProducts()
    .filter { products -> products.isNotEmpty() }
    .map { products -> products.sortedBy { it.name } }
    .catch { e -> emit(emptyList()) }
    .onEach { products -> cacheProducts(products) }
    .flowOn(Dispatchers.IO)
    .collect { products -> updateUI(products) }

// combine – একাধিক Flow একত্রিত
combine(
    repository.getProducts(),
    searchQueryFlow,
    filterCategoryFlow
) { products, query, category ->
    products.filter { product ->
        product.name.contains(query, ignoreCase = true) &&
        (category.isEmpty() || product.category == category)
    }
}.collect { filteredProducts -> updateUI(filteredProducts) }

// StateFlow রূপান্তর
val filteredProducts: StateFlow<List<Product>> = combine(
    _allProducts,
    _searchQuery
) { products, query ->
    if (query.isEmpty()) products else products.filter { it.name.contains(query) }
}.stateIn(
    scope = viewModelScope,
    started = SharingStarted.WhileSubscribed(5000),
    initialValue = emptyList()
)
```

---

## Firebase ইন্টিগ্রেশন

```kotlin
// google-services.json ডাউনলোড করুন Firebase Console থেকে
// build.gradle (project): classpath("com.google.gms:google-services:4.4.0")
// build.gradle (app): apply plugin: 'com.google.gms.google-services'
```

```kotlin
// Firebase Auth
class AuthRepository @Inject constructor(
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
) {
    val currentUser: FirebaseUser? get() = auth.currentUser

    suspend fun signIn(email: String, password: String): Result<FirebaseUser> {
        return try {
            val result = auth.signInWithEmailAndPassword(email, password).await()
            Result.success(result.user!!)
        } catch (e: FirebaseAuthException) {
            Result.failure(Exception(getErrorMessage(e.errorCode)))
        }
    }

    suspend fun signUp(email: String, password: String, name: String): Result<FirebaseUser> {
        return try {
            val result = auth.createUserWithEmailAndPassword(email, password).await()
            result.user?.updateProfile(userProfileChangeRequest { displayName = name })?.await()
            Result.success(result.user!!)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun resetPassword(email: String): Result<Unit> {
        return try {
            auth.sendPasswordResetEmail(email).await()
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun signOut() = auth.signOut()

    fun getAuthStateFlow(): Flow<FirebaseUser?> = callbackFlow {
        val listener = FirebaseAuth.AuthStateListener { auth -> trySend(auth.currentUser) }
        auth.addAuthStateListener(listener)
        awaitClose { auth.removeAuthStateListener(listener) }
    }
}

// Firestore
class ProductFirestoreRepository @Inject constructor(
    private val db: FirebaseFirestore = FirebaseFirestore.getInstance()
) {
    private val productsCollection = db.collection("products")

    // যোগ করা
    suspend fun addProduct(product: Product): Result<String> {
        return try {
            val docRef = productsCollection.add(product.toMap()).await()
            Result.success(docRef.id)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    // রিয়েলটাইম স্ট্রিম
    fun getProducts(): Flow<List<Product>> = callbackFlow {
        val listener = productsCollection
            .orderBy("createdAt", Query.Direction.DESCENDING)
            .addSnapshotListener { snapshot, error ->
                if (error != null) { close(error); return@addSnapshotListener }
                val products = snapshot?.documents?.mapNotNull { doc ->
                    doc.toObject(Product::class.java)?.copy(id = doc.id.hashCode())
                } ?: emptyList()
                trySend(products)
            }
        awaitClose { listener.remove() }
    }

    // কোয়েরি
    suspend fun getByCategory(category: String): List<Product> {
        return productsCollection
            .whereEqualTo("category", category)
            .whereLessThan("price", 1000)
            .orderBy("price")
            .limit(20)
            .get().await()
            .toObjects(Product::class.java)
    }
}
```

---

## Push Notification

```kotlin
// FirebaseMessagingService
class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        // সার্ভারে টোকেন পাঠান
        sendTokenToServer(token)
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        // নোটিফিকেশন পেলোড
        remoteMessage.notification?.let { notification ->
            showNotification(
                title = notification.title ?: "নতুন বার্তা",
                body = notification.body ?: ""
            )
        }

        // ডেটা পেলোড
        if (remoteMessage.data.isNotEmpty()) {
            val type = remoteMessage.data["type"]
            val id = remoteMessage.data["id"]
            handleDataMessage(type, id)
        }
    }

    private fun showNotification(title: String, body: String) {
        val channelId = "default_channel"

        // Intent
        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(
            this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val notification = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(title)
            .setContentText(body)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .build()

        NotificationManagerCompat.from(this).notify(System.currentTimeMillis().toInt(), notification)
    }
}

// Application ক্লাসে চ্যানেল তৈরি
fun createNotificationChannels() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(
            "default_channel",
            "সাধারণ বিজ্ঞপ্তি",
            NotificationManager.IMPORTANCE_DEFAULT
        ).apply {
            description = "সাধারণ অ্যাপ বিজ্ঞপ্তি"
        }
        val manager = getSystemService(NotificationManager::class.java)
        manager.createNotificationChannel(channel)
    }
}
```

---

## Permission ম্যানেজমেন্ট

```kotlin
// ActivityResultContracts দিয়ে (আধুনিক পদ্ধতি)
class CameraActivity : AppCompatActivity() {

    private val cameraPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) openCamera()
        else showPermissionDeniedMessage()
    }

    private val multiplePermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        val cameraGranted = permissions[Manifest.permission.CAMERA] ?: false
        val storageGranted = permissions[Manifest.permission.READ_EXTERNAL_STORAGE] ?: false

        if (cameraGranted && storageGranted) proceed()
        else showDeniedPermissions()
    }

    fun checkAndRequestCamera() {
        when {
            ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED -> {
                openCamera()
            }
            shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {
                // ব্যাখ্যা দিন তারপর চাইুন
                showRationaleDialog {
                    cameraPermissionLauncher.launch(Manifest.permission.CAMERA)
                }
            }
            else -> {
                cameraPermissionLauncher.launch(Manifest.permission.CAMERA)
            }
        }
    }
}

// Compose-এ
@Composable
fun CameraPermissionScreen() {
    val cameraPermissionState = rememberPermissionState(Manifest.permission.CAMERA)

    // implementation("com.google.accompanist:accompanist-permissions:0.32.0")

    when {
        cameraPermissionState.status.isGranted -> {
            CameraContent()
        }
        cameraPermissionState.status.shouldShowRationale -> {
            Column {
                Text("ক্যামেরা ব্যবহারের জন্য অনুমতি প্রয়োজন")
                Button(onClick = { cameraPermissionState.launchPermissionRequest() }) {
                    Text("অনুমতি দিন")
                }
            }
        }
        else -> {
            Button(onClick = { cameraPermissionState.launchPermissionRequest() }) {
                Text("ক্যামেরার অনুমতি চাইুন")
            }
        }
    }
}
```

---

## Camera ও Gallery

```kotlin
class ImagePickerActivity : AppCompatActivity() {

    private lateinit var photoUri: Uri

    // গ্যালারি থেকে ছবি নিন
    private val galleryLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let { processImage(it) }
    }

    // ক্যামেরা দিয়ে ছবি তুলুন
    private val cameraLauncher = registerForActivityResult(
        ActivityResultContracts.TakePicture()
    ) { success: Boolean ->
        if (success) processImage(photoUri)
    }

    fun openGallery() {
        galleryLauncher.launch("image/*")
    }

    fun openCamera() {
        photoUri = createImageUri()
        cameraLauncher.launch(photoUri)
    }

    private fun createImageUri(): Uri {
        val imageFile = File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), "photo_${System.currentTimeMillis()}.jpg")
        return FileProvider.getUriForFile(this, "${packageName}.fileprovider", imageFile)
    }

    private fun processImage(uri: Uri) {
        binding.ivPhoto.load(uri) { crossfade(true) }
        // সার্ভারে আপলোড করুন
        uploadImage(uri)
    }

    private fun uploadImage(uri: Uri) {
        val file = File(uri.path ?: return)
        val requestBody = file.asRequestBody("image/*".toMediaType())
        val body = MultipartBody.Part.createFormData("image", file.name, requestBody)

        viewModelScope.launch {
            apiService.uploadImage(body)
        }
    }
}
```

---

## Maps ও Location

```kotlin
implementation("com.google.android.gms:play-services-maps:18.2.0")
implementation("com.google.android.gms:play-services-location:21.1.0")
```

```kotlin
// Google Maps Fragment (XML)
// activity_maps.xml-এ
// <fragment android:name="com.google.android.gms.maps.SupportMapFragment" .../>

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        // মার্কার যোগ করুন
        val dhaka = LatLng(23.8103, 90.4125)
        map.addMarker(MarkerOptions().position(dhaka).title("ঢাকা, বাংলাদেশ"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(dhaka, 12f))

        // বর্তমান অবস্থান
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            map.isMyLocationEnabled = true
            getCurrentLocation()
        }

        // ক্লিক লিসেনার
        map.setOnMarkerClickListener { marker ->
            Toast.makeText(this, marker.title, Toast.LENGTH_SHORT).show()
            true
        }
    }

    private fun getCurrentLocation() {
        fusedLocationClient.lastLocation.addOnSuccessListener { location ->
            location?.let {
                val currentLatLng = LatLng(it.latitude, it.longitude)
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 15f))
            }
        }
    }

    // রিয়েলটাইম লোকেশন আপডেট
    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(result: LocationResult) {
            result.lastLocation?.let { location ->
                val latLng = LatLng(location.latitude, location.longitude)
                map.animateCamera(CameraUpdateFactory.newLatLng(latLng))
            }
        }
    }

    fun startLocationUpdates() {
        val request = LocationRequest.Builder(10_000L)
            .setPriority(Priority.PRIORITY_HIGH_ACCURACY)
            .build()

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            fusedLocationClient.requestLocationUpdates(request, locationCallback, Looper.getMainLooper())
        }
    }

    override fun onPause() {
        super.onPause()
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }
}
```

---

## টেস্টিং

### Unit Test
```kotlin
// test/java/...
class ProductViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private val fakeRepository = FakeProductRepository()
    private lateinit var viewModel: ProductViewModel

    @Before
    fun setup() {
        viewModel = ProductViewModel(fakeRepository)
    }

    @Test
    fun `পণ্য লোড হলে তালিকা দেখায়`() = runTest {
        // Given
        val expected = listOf(Product(1, "আম", 120.0, "", "ফল", 4.5, 100))
        fakeRepository.setProducts(expected)

        // When
        viewModel.loadProducts()

        // Then
        val state = viewModel.uiState.value
        assertThat(state.products).isEqualTo(expected)
        assertThat(state.isLoading).isFalse()
    }

    @Test
    fun `নেটওয়ার্ক ত্রুটিতে error দেখায়`() = runTest {
        fakeRepository.setError(IOException("নেটওয়ার্ক ত্রুটি"))

        viewModel.loadProducts()

        assertThat(viewModel.uiState.value.error).isNotNull()
    }
}

// Fake Repository
class FakeProductRepository : ProductRepository {
    private var products: List<Product> = emptyList()
    private var error: Exception? = null

    fun setProducts(products: List<Product>) { this.products = products }
    fun setError(error: Exception) { this.error = error }

    override suspend fun getProducts(): List<Product> {
        error?.let { throw it }
        return products
    }
}

// MainDispatcherRule
class MainDispatcherRule(val dispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()) : TestWatcher() {
    override fun starting(description: Description) { Dispatchers.setMain(dispatcher) }
    override fun finished(description: Description) { Dispatchers.resetMain(); dispatcher.cleanupTestCoroutines() }
}
```

### UI Test (Espresso - XML)
```kotlin
// androidTest/java/...
@RunWith(AndroidJUnit4::class)
class LoginActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun testSuccessfulLogin() {
        // ইমেইল লিখুন
        onView(withId(R.id.etEmail)).perform(typeText("test@test.com"), closeSoftKeyboard())

        // পাসওয়ার্ড লিখুন
        onView(withId(R.id.etPassword)).perform(typeText("123456"), closeSoftKeyboard())

        // লগইন বাটনে ক্লিক
        onView(withId(R.id.btnLogin)).perform(click())

        // হোম স্ক্রিন দেখা যাচ্ছে
        onView(withId(R.id.tvWelcome)).check(matches(isDisplayed()))
    }

    @Test
    fun testEmptyFieldShowsError() {
        onView(withId(R.id.btnLogin)).perform(click())
        onView(withText("ইমেইল প্রয়োজন")).check(matches(isDisplayed()))
    }
}
```

### Compose UI Test
```kotlin
@RunWith(AndroidJUnit4::class)
class ProductListScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun productListShowsItems() {
        val products = listOf(Product(1, "আম", 120.0, "", "ফল", 4.5, 100))

        composeTestRule.setContent {
            MaterialTheme {
                ProductListScreen(products = products, onProductClick = {})
            }
        }

        composeTestRule.onNodeWithText("আম").assertIsDisplayed()
        composeTestRule.onNodeWithText("৳120.0").assertIsDisplayed()
    }

    @Test
    fun clickingProductCallsCallback() {
        var clickedProduct: Product? = null
        val product = Product(1, "আম", 120.0, "", "ফল", 4.5, 100)

        composeTestRule.setContent {
            MaterialTheme {
                ProductListScreen(products = listOf(product), onProductClick = { clickedProduct = it })
            }
        }

        composeTestRule.onNodeWithText("আম").performClick()
        assertThat(clickedProduct).isEqualTo(product)
    }
}
```

---

## অ্যাপ প্রকাশ

### Signing Configuration
```kotlin
// build.gradle.kts
android {
    signingConfigs {
        create("release") {
            storeFile = file(project.property("STORE_FILE") as String)
            storePassword = project.property("STORE_PASSWORD") as String
            keyAlias = project.property("KEY_ALIAS") as String
            keyPassword = project.property("KEY_PASSWORD") as String
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
        }
    }
}
```

```bash
# Keystore তৈরি
keytool -genkey -v -keystore my-release-key.jks \
  -keyalg RSA -keysize 2048 -validity 10000 \
  -alias my-key-alias

# Release APK তৈরি
./gradlew assembleRelease

# Release Bundle তৈরি (Play Store)
./gradlew bundleRelease
```

### ProGuard নিয়ম
```pro
# proguard-rules.pro
-keep class com.example.myapp.data.** { *; }
-keep class com.example.myapp.domain.model.** { *; }

# Retrofit
-keepattributes Signature
-keepattributes *Annotation*
-keep class retrofit2.** { *; }
-keepclasseswithmembers class * { @retrofit2.http.* <methods>; }

# Gson
-keep class com.google.gson.** { *; }
-keep class * implements com.google.gson.TypeAdapterFactory
-keepclassmembers,allowobfuscation class * { @com.google.gson.annotations.SerializedName <fields>; }

# Room
-keep class * extends androidx.room.RoomDatabase
-keep @androidx.room.Entity class *

# Hilt
-keep class dagger.hilt.** { *; }
```

### BuildConfig পরিবেশ ভেদে কনফিগ
```kotlin
android {
    buildTypes {
        debug {
            buildConfigField("String", "BASE_URL", "\"https://dev-api.example.com/\"")
            buildConfigField("Boolean", "ENABLE_LOGGING", "true")
        }
        release {
            buildConfigField("String", "BASE_URL", "\"https://api.example.com/\"")
            buildConfigField("Boolean", "ENABLE_LOGGING", "false")
        }
    }
}

// ব্যবহার
val baseUrl = BuildConfig.BASE_URL
```

---

## সম্পূর্ণ প্রজেক্ট উদাহরণ

### ই-কমার্স অ্যাপ – MVVM + Jetpack Compose + Hilt

```kotlin
// domain/model/Product.kt
data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val imageUrl: String,
    val category: String,
    val rating: Float,
    val reviewCount: Int,
    val description: String = "",
    val isFavorite: Boolean = false
)

// domain/repository/ProductRepository.kt
interface ProductRepository {
    fun getProducts(): Flow<Resource<List<Product>>>
    fun getProductById(id: Int): Flow<Resource<Product>>
    suspend fun toggleFavorite(productId: Int)
    suspend fun addToCart(product: Product, quantity: Int)
}

// domain/usecase/GetProductsUseCase.kt
class GetProductsUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    operator fun invoke(category: String? = null): Flow<Resource<List<Product>>> {
        return repository.getProducts().map { resource ->
            when (resource) {
                is Resource.Success -> {
                    val filtered = if (category != null) {
                        resource.data?.filter { it.category == category }
                    } else {
                        resource.data
                    }
                    Resource.Success(filtered ?: emptyList())
                }
                is Resource.Error -> resource
                is Resource.Loading -> resource
            }
        }
    }
}

// presentation/viewmodel/HomeViewModel.kt
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase
) : ViewModel() {

    private val _selectedCategory = MutableStateFlow<String?>(null)

    val uiState: StateFlow<HomeUiState> = _selectedCategory.flatMapLatest { category ->
        getProductsUseCase(category).map { resource ->
            when (resource) {
                is Resource.Loading -> HomeUiState(isLoading = true)
                is Resource.Success -> HomeUiState(products = resource.data ?: emptyList())
                is Resource.Error -> HomeUiState(error = resource.message)
            }
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), HomeUiState(isLoading = true))

    fun selectCategory(category: String?) {
        _selectedCategory.value = category
    }

    fun toggleFavorite(productId: Int) {
        viewModelScope.launch { toggleFavoriteUseCase(productId) }
    }
}

data class HomeUiState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)

// presentation/ui/HomeScreen.kt
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val categories = listOf("সব", "ফল", "সবজি", "মাছ", "মাংস")
    var selectedCategory by remember { mutableStateOf("সব") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("বাংলা বাজার 🛒", style = MaterialTheme.typography.titleLarge)
                },
                actions = {
                    IconButton(onClick = { navController.navigate(Routes.CART) }) {
                        BadgedBox(badge = { Badge { Text("৩") } }) {
                            Icon(Icons.Default.ShoppingCart, "কার্ট")
                        }
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            // ক্যাটাগরি ফিল্টার
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(categories) { category ->
                    FilterChip(
                        selected = selectedCategory == category,
                        onClick = {
                            selectedCategory = category
                            viewModel.selectCategory(if (category == "সব") null else category)
                        },
                        label = { Text(category) }
                    )
                }
            }

            // বিষয়বস্তু
            when {
                uiState.isLoading -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator()
                    }
                }
                uiState.error != null -> {
                    ErrorView(message = uiState.error!!, onRetry = { viewModel.selectCategory(null) })
                }
                else -> {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        contentPadding = PaddingValues(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(uiState.products, key = { it.id }) { product ->
                            ProductGridItem(
                                product = product,
                                onProductClick = { navController.navigate(Routes.productDetail(product.id)) },
                                onFavoriteClick = { viewModel.toggleFavorite(product.id) },
                                modifier = Modifier.animateItemPlacement()
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ProductGridItem(
    product: Product,
    onProductClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth().clickable(onClick = onProductClick),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column {
            Box {
                AsyncImage(
                    model = product.imageUrl,
                    contentDescription = product.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth().height(140.dp)
                )
                IconButton(
                    onClick = onFavoriteClick,
                    modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Icon(
                        if (product.isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                        contentDescription = null,
                        tint = if (product.isFavorite) Color.Red else Color.White
                    )
                }
            }
            Column(modifier = Modifier.padding(8.dp)) {
                Text(product.name, fontWeight = FontWeight.Bold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Star, null, tint = Color(0xFFFFC107), modifier = Modifier.size(14.dp))
                    Text("${product.rating}", fontSize = 12.sp)
                    Text(" (${product.reviewCount})", fontSize = 11.sp, color = Color.Gray)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("৳${product.price.toInt()}", color = Color(0xFF4CAF50), fontWeight = FontWeight.Bold)
                    IconButton(onClick = {}, modifier = Modifier.size(32.dp)) {
                        Icon(Icons.Default.AddShoppingCart, null, modifier = Modifier.size(18.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun ErrorView(message: String, onRetry: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(Icons.Default.ErrorOutline, null, modifier = Modifier.size(64.dp), tint = Color.Red)
        Spacer(Modifier.height(16.dp))
        Text(message, textAlign = TextAlign.Center)
        Spacer(Modifier.height(16.dp))
        Button(onClick = onRetry) { Text("পুনরায় চেষ্টা করুন") }
    }
}
```

---

## দরকারী লাইব্রেরি সমূহ

### নেটওয়ার্কিং
- `Retrofit` – HTTP ক্লায়েন্ট
- `OkHttp` – HTTP কোর
- `Gson` / `Moshi` – JSON পার্সার
- `Ktor` – Kotlin-first HTTP ক্লায়েন্ট

### ডেটাবেজ
- `Room` – SQLite ORM (অফিসিয়াল)
- `Realm` – মোবাইল ডেটাবেজ
- `SQLDelight` – টাইপ-নিরাপদ SQL

### DI (ডিপেন্ডেন্সি ইনজেকশন)
- `Hilt` – অ্যান্ড্রয়েড অফিসিয়াল
- `Koin` – হালকা, Kotlin-first

### ইমেজ
- `Coil` – Kotlin-first (সুপারিশকৃত)
- `Glide` – পরিপক্ক, জনপ্রিয়
- `Picasso` – সহজ

### UI
- `Material Components` – Google-এর UI লাইব্রেরি
- `Accompanist` – Compose অতিরিক্ত উইজেট
- `Lottie` – JSON অ্যানিমেশন
- `MPAndroidChart` – চার্ট ও গ্রাফ
- `Shimmer` – লোডিং ইফেক্ট

### ইউটিলিটি
- `Timber` – লগিং
- `LeakCanary` – মেমোরি লিক ডিটেকশন
- `Chucker` – HTTP ইন্সপেক্টর
- `ThreeTenABP` – তারিখ/সময়

---

## উপকারী টিপস

### Logcat ব্যবহার
```kotlin
import timber.log.Timber

// Timber সেটআপ (Application ক্লাসে)
if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

// ব্যবহার
Timber.d("Debug: $message")
Timber.e(exception, "ত্রুটি ঘটেছে")
Timber.i("তথ্য: $info")
```

### ANR এড়ানো
```kotlin
// ❌ Main Thread-এ দীর্ঘ কাজ করবেন না
binding.btnLoad.setOnClickListener {
    val data = database.getAllProducts()  // ANR!
}

// ✅ Coroutine ব্যবহার করুন
binding.btnLoad.setOnClickListener {
    lifecycleScope.launch {
        val data = withContext(Dispatchers.IO) { database.getAllProducts() }
        adapter.submitList(data)
    }
}
```

### Memory Leak এড়ানো
```kotlin
// ❌ Fragment-এ binding null না করলে leak হয়
class MyFragment : Fragment() {
    private var binding: FragmentMyBinding? = null

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null  // ✅ অবশ্যই null করুন
    }
}

// ❌ Listener-এ strong reference
class BadActivity : AppCompatActivity() {
    override fun onCreate(...) {
        SomeManager.addListener(this)  // Activity leak!
    }
    // onDestroy-এ removeListener না করলে leak
}
```

---

## পরবর্তী ধাপ

এই গাইড সম্পন্ন করার পর আপনি প্রস্তুত থাকবেন:

১. **বাস্তব Android অ্যাপ** তৈরি করতে – ই-কমার্স, সোশ্যাল মিডিয়া, ফিনটেক
২. **Modular Architecture** শিখতে – feature modules, dynamic delivery
৩. **Jetpack** গভীরভাবে শিখতে – Paging 3, CameraX, ML Kit
৪. **CI/CD** সেটআপ করতে – GitHub Actions, Bitrise, Fastlane
৫. **Google Play Console** থেকে অ্যাপ পরিচালনা করতে
৬. **Kotlin Multiplatform (KMP)** শিখতে – Android ও iOS শেয়ার কোড

---

## রিসোর্সসমূহ

- **অফিসিয়াল Android ডকুমেন্টেশন:** https://developer.android.com
- **Jetpack Compose:** https://developer.android.com/jetpack/compose
- **Kotlin ডকুমেন্টেশন:** https://kotlinlang.org/docs
- **Android Codelabs:** https://developer.android.com/codelabs
- **Now in Android (sample app):** https://github.com/android/nowinandroid
- **Android Architecture Samples:** https://github.com/android/architecture-samples
- **Material Design 3:** https://m3.material.io
- **Android Developers YouTube:** https://youtube.com/@AndroidDevelopers

---

> **মনে রাখুন:** Android Development শেখার সেরা উপায় হলো বাস্তব প্রজেক্ট তৈরি করা। XML দিয়ে শুরু করুন, তারপর ধীরে ধীরে Jetpack Compose শিখুন। Google-এর অফিসিয়াল Codelabs অনুসরণ করুন এবং "Now in Android" প্রজেক্ট থেকে শিখুন। Stack Overflow ও Android Developers YouTube চ্যানেল আপনার সেরা বন্ধু!