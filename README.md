cat << 'EOF' > start-kotlin.sh
#!/bin/bash

echo "======================================"
echo "  Kotlin শুরু করার স্ক্রিপ্ট (Mac)"
echo "======================================"
echo ""

# ১. Homebrew আছে কি না চেক
if ! command -v brew &> /dev/null; then
    echo "Homebrew ইনস্টল করা হচ্ছে..."
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
else
    echo "Homebrew ইতিমধ্যে আছে ✓"
fi

# ২. Kotlin ইনস্টল/আপডেট
echo ""
echo "Kotlin ইনস্টল/আপডেট করা হচ্ছে..."
brew install kotlin || brew upgrade kotlin

# ৩. Kotlin version দেখাও
echo ""
echo "Kotlin Version:"
kotlinc -version

# ৪. hello.kt তৈরি (যদি আগে থেকে না থাকে)
if [ ! -f "hello.kt" ]; then
    echo ""
    echo "hello.kt ফাইল তৈরি করা হচ্ছে..."
    cat << 'KOTLIN' > hello.kt
fun main() {
    println("Hello Kotlin from MacBook!")
}
KOTLIN
    echo "hello.kt তৈরি হয়েছে ✓"
else
    echo "hello.kt ইতিমধ্যে আছে (ওভাররাইট করা হয়নি)"
fi

# ৫. কম্পাইল + রান
echo ""
echo "কম্পাইল করা হচ্ছে → hello.jar"
kotlinc hello.kt -include-runtime -d hello.jar

echo ""
echo "প্রোগ্রাম রান করা হচ্ছে..."
java -jar hello.jar

echo ""
echo "======================================"
echo "সব শেষ! 🎉"
echo "এখন Android Studio ওপেন করে নতুন প্রজেক্ট শুরু করতে পারো।"
echo "======================================"
EOF

# ফাইলকে এক্সিকিউটেবল করা
chmod +x start-kotlin.sh

echo ""
echo "ফাইল তৈরি হয়েছে! এখন রান করতে লেখো:"
echo "    ./start-kotlin.sh"
echo ""
