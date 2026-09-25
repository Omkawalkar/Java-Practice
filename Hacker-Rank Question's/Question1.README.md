# Question1.java - Anagram Checker

## 📋 Overview
A Java program that checks if two strings are **anagrams** (words formed by rearranging letters of another word).

```
┌─────────────────────────────────────────────────────────────┐
│                    ANAGRAM CHECKER                          │
├─────────────────────────────────────────────────────────────┤
│  Input:  Two strings                                        │
│  Output: "is anagram" or "not an anagram"                   │
│  Algorithm: Character Frequency Counting (O(n) time)        │
└─────────────────────────────────────────────────────────────┘
```

---

## 🎯 What is an Anagram?

```
┌────────────────────────────────────────────────────────────┐
│  DEFINITION: Two strings are anagrams if they contain      │
│  exactly the same characters with the same frequency,      │
│  but possibly in different orders.                         │
└────────────────────────────────────────────────────────────┘

EXAMPLES:
┌──────────────┬──────────────┬──────────────────────────────┐
│ String A     │ String B     │ Result                       │
├──────────────┼──────────────┼──────────────────────────────┤
│ "listen"     │ "silent"     │ ✅ YES (same letters)        │
│ "triangle"   │ "integral"   │ ✅ YES                       │
│ "hello"      │ "world"      │ ❌ NO (different letters)    │
│ "Astronomer" │ "Moon starer"│ ✅ YES (ignores case/space)  │
│ "abc"        │ "abcd"       │ ❌ NO (different lengths)    │
└──────────────┴──────────────┴──────────────────────────────┘
```

---

## 🏗️ Program Architecture

```
┌────────────────────────────────────────────────────────────────┐
│                        QUESTION1.JAVA                          │
├────────────────────────────────────────────────────────────────┤
│                                                                │
│  ┌──────────────┐    ┌──────────────┐    ┌────────────────┐  │
│  │   main()     │───▶│ isAnagram()  │───▶│  Return bool   │  │
│  │  (Entry)     │    │  (Logic)     │    │  (Result)      │  │
│  └──────────────┘    └──────────────┘    └────────────────┘  │
│        │                    │                    │             │
│        ▼                    ▼                    ▼             │
│  ┌──────────────┐    ┌──────────────┐    ┌────────────────┐  │
│  │ • Scanner    │    │ • Normalize  │    │ • Print result │  │
│  │ • Read input │    │ • Count freq │    │ • Close scanner│  │
│  │ • Call method│    │ • Compare    │    │                │  │
│  └──────────────┘    └──────────────┘    └────────────────┘  │
│                                                                │
└────────────────────────────────────────────────────────────────┘
```

---

## 🔄 Algorithm Flowchart

```
┌─────────────────────────────────────────────────────────────────┐
│                      isAnagram(a, b)                            │
└─────────────────────────────────────────────────────────────────┘
                              │
                              ▼
                    ┌─────────────────┐
                    │ Validate Input  │
                    │ (null check)    │
                    └────────┬────────┘
                             │
              ┌──────────────┴──────────────┐
              ▼                             ▼
         Null found?                     Valid
              │                             │
         ┌────┴────┐                        ▼
         ▼         ▼               ┌─────────────────┐
        YES       NO               │ Normalize       │
         │                         │ Strings         │
         ▼                         │ (lowercase +    │
      return                       │ remove spaces)  │
      false                        └────────┬────────┘
                                             │
                                             ▼
                                    ┌─────────────────┐
                                    │ Length Check    │
                                    │ (quick reject)  │
                                    └────────┬────────┘
                                             │
                              ┌──────────────┴──────────────┐
                              ▼                             ▼
                         Different?                      Same?
                              │                             │
                         ┌────┴────┐                        ▼
                         ▼         ▼               ┌─────────────────┐
                        YES       NO               │ Create freq[26] │
                         │                         │ array (all 0)   │
                         ▼                         └────────┬────────┘
                      return                                 │
                      false                                   ▼
                                                  ┌─────────────────┐
                                                  │ Loop 1: Count   │
                                                  │ String A chars  │
                                                  │ freq[ch-'a']++  │
                                                  └────────┬────────┘
                                                           │
                                                           ▼
                                                  ┌─────────────────┐
                                                  │ Loop 2: Subtract│
                                                  │ String B chars  │
                                                  │ freq[ch-'a']--  │
                                                  └────────┬────────┘
                                                           │
                                                           ▼
                                                  ┌─────────────────┐
                                                  │ Loop 3: Verify  │
                                                  │ All freq[i]==0? │
                                                  └────────┬────────┘
                                                           │
                                              ┌──────────────┴──────────────┐
                                              ▼                             ▼
                                         Any non-zero?                    All zero?
                                              │                             │
                                         ┌────┴────┐                    ┌────┴────┐
                                         ▼         ▼                    ▼         ▼
                                        YES       NO                 YES        NO
                                         │                          (impossible)  │
                                         ▼                                           ▼
                                    return false                              return true
```

---

## 🧮 Frequency Array - Visual Explanation

### The Core Concept: `int[26]` Array

```
┌────────────────────────────────────────────────────────────────────┐
│  INDEX MAPPING: 'a'=0, 'b'=1, 'c'=2, ..., 'z'=25                │
│  FORMULA: index = character - 'a'                                │
└────────────────────────────────────────────────────────────────────┘

VISUAL ARRAY:
┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐
│ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │12 │13 │14 │15 │16 │17 │18 │19 │20 │21 │22 │23 │24 │25 │
├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤
│ a │ b │ c │ d │ e │ f │ g │ h │ i │ j │ k │ l │ m │ n │ o │ p │ q │ r │ s │ t │ u │ v │ w │ x │ y │ z │
└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘
  ▲                                                                                               ▲
  │                                                                                               │
  └───────────────────────── ALL INITIALIZED TO 0 ────────────────────────────────────────────────┘
```

---

## 📊 Step-by-Step Example: "listen" vs "silent"

### Input Strings
```
String A = "listen"     String B = "silent"
```

### After Normalization (lowercase, no spaces)
```
normalizedA = "listen"  (6 chars)
normalizedB = "silent"  (6 chars)
Length check: 6 == 6 ✓
```

### Initial Frequency Array
```
freq = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        a b c d e f g h i j k  l  m  n  o p q r  s  t  u v w x y z
```

---

### LOOP 1: Process String A ("listen")

| Step | Char | ASCII | Calculation | Index | Action | freq[index] |
|------|------|-------|-------------|-------|--------|-------------|
| 1    | 'l'  | 108   | 108 - 97    | 11    | ++     | freq[11] = 1 |
| 2    | 'i'  | 105   | 105 - 97    | 8     | ++     | freq[8] = 1  |
| 3    | 's'  | 115   | 115 - 97    | 18    | ++     | freq[18] = 1 |
| 4    | 't'  | 116   | 116 - 97    | 19    | ++     | freq[19] = 1 |
| 5    | 'e'  | 101   | 101 - 97    | 4     | ++     | freq[4] = 1  |
| 6    | 'n'  | 110   | 110 - 97    | 13    | ++     | freq[13] = 1 |

```
AFTER LOOP 1:
freq = [0,0,0,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,0,1,1,0,0,0,0,0]
        a b c d e f g h i j k  l  m  n  o p q r  s  t  u v w x y z
           ▲       ▲       ▲       ▲       ▲       ▲
           e       i       l       n       s       t
```

---

### LOOP 2: Process String B ("silent")

| Step | Char | ASCII | Calculation | Index | Action | freq[index] |
|------|------|-------|-------------|-------|--------|-------------|
| 1    | 's'  | 115   | 115 - 97    | 18    | --     | freq[18] = 0 |
| 2    | 'i'  | 105   | 105 - 97    | 8     | --     | freq[8] = 0  |
| 3    | 'l'  | 108   | 108 - 97    | 11    | --     | freq[11] = 0 |
| 4    | 'e'  | 101   | 101 - 97    | 4     | --     | freq[4] = 0  |
| 5    | 'n'  | 110   | 110 - 97    | 13    | --     | freq[13] = 0 |
| 6    | 't'  | 116   | 116 - 97    | 19    | --     | freq[19] = 0 |

```
AFTER LOOP 2:
freq = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        a b c d e f g h i j k  l  m  n  o p q r  s  t  u v w x y z
           ▲       ▲       ▲       ▲       ▲       ▲
           ALL ZERO! ✅
```

---

### LOOP 3: Verify All Zeros

```
Check each index 0-25:
freq[0] = 0 ✓
freq[1] = 0 ✓
...
freq[25] = 0 ✓

ALL ZERO → return TRUE 🎉
```

---

## ❌ Example: "hello" vs "world" (NOT Anagrams)

```
String A = "hello"  →  h:1, e:1, l:2, o:1
String B = "world"  →  w:1, o:1, r:1, l:1, d:1

AFTER LOOP 1 (hello):
freq = [0,0,0,1,1,0,0,1,0,0,0,2,0,0,1,0,0,0,0,0,0,0,1,0,0,0]
        a b c d e f g h i j k  l  m  n  o p q r  s  t  u v w x y z

AFTER LOOP 2 (world):
freq = [0,0,0,0,0,0,0,1,0,0,0,1,0,-1,0,0,0,1,0,0,0,0,0,1,0,0]
        a b c d e f g h i j k  l  m  n  o p q r  s  t  u v w x y z
                          ▲       ▲           ▲       ▲       ▲
                         d: -1    h: 1       l: 1     r: 1    w: 1

LOOP 3: Found non-zero at index 3 (d) → return FALSE ❌
```

---

## 💻 Code Structure Breakdown

### File Organization
```
Question1.java
│
├── Import Section
│   └── import java.util.Scanner;
│
├── Class: Question1
│   │
│   ├── Method: isAnagram(String a, String b) → boolean
│   │   │
│   │   ├── Input Validation (null check)
│   │   ├── Normalization (lowercase + trim spaces)
│   │   ├── Empty String Check
│   │   ├── Length Check (early exit)
│   │   ├── Frequency Array Creation (int[26])
│   │   ├── Loop 1: Count String A chars
│   │   ├── Loop 2: Subtract String B chars
│   │   ├── Loop 3: Verify all zeros
│   │   └── Return Result
│   │
│   └── Method: main(String[] args)
│       │
│       ├── Create Scanner
│       ├── Prompt & Read Input 1 (nextLine)
│       ├── Prompt & Read Input 2 (nextLine)
│       ├── Call isAnagram()
│       ├── Print Result (ternary operator)
│       └── Close Scanner
```

---

## 🔧 Key Improvements Over Basic Version

```
┌────────────────────────────────────────────────────────────────────┐
│                    IMPROVEMENTS SUMMARY                            │
├──────────────────┬────────────────────────────────────────────────┤
│ #   Feature      │ Description                                     │
├──────────────────┼────────────────────────────────────────────────┤
│ 1   Case         │ Converts both strings to lowercase              │
│     Insensitive  │ "Listen" + "SILENT" → works!                   │
├──────────────────┼────────────────────────────────────────────────┤
│ 2   Space        │ Removes ALL whitespace (spaces, tabs, newlines)│
│     Handling     │ "Astronomer" + "Moon starer" → works!          │
├──────────────────┼────────────────────────────────────────────────┤
│ 3   Input        │ Checks for null strings before processing      │
│     Validation   │ Prevents NullPointerException                  │
├──────────────────┼────────────────────────────────────────────────┤
│ 4   Non-Alpha    │ Ignores numbers, punctuation, symbols          │
│     Filter       │ Only counts a-z letters                        │
├──────────────────┼────────────────────────────────────────────────┤
│ 5   Typo Fix     │ "Secound number" → "Enter second word"         │
├──────────────────┼────────────────────────────────────────────────┤
│ 6   Better Input │ Uses nextLine() instead of next()              │
│     Reading      │ Captures full phrases with spaces              │
├──────────────────┼────────────────────────────────────────────────┤
│ 7   Grammar Fix  │ "not a anagram" → "not an anagram"             │
├──────────────────┼────────────────────────────────────────────────┤
│ 8   Resource     │ Closes Scanner (sc.close())                    │
│     Management   │ Prevents resource leak                         │
└──────────────────┴────────────────────────────────────────────────┘
```

---

## ⚡ Complexity Analysis

```
┌─────────────────────────────────────────────────────────────────┐
│                    TIME COMPLEXITY                              │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│  Let n = length of normalized strings                          │
│                                                                 │
│  Normalization:    O(n)  - toLowerCase() + replaceAll()        │
│  Length Check:     O(1)  - Constant time                       │
│  Loop 1 (Count):   O(n)  - Single pass through String A        │
│  Loop 2 (Subtract):O(n)  - Single pass through String B        │
│  Loop 3 (Verify):  O(26) - Fixed 26 iterations = O(1)          │
│  ───────────────────────────────────────────────────────────   │
│  TOTAL:            O(n)  - Linear time! 🚀                     │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────┐
│                    SPACE COMPLEXITY                             │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│  Frequency Array:  int[26] = 26 × 4 bytes = 104 bytes          │
│  Normalized Strings: O(n) for new string objects               │
│  ───────────────────────────────────────────────────────────   │
│  AUXILIARY SPACE:  O(1)  - Constant extra space! 💾            │
│  (Not counting input storage)                                   │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
```

---

## 🧪 Test Cases

```
┌────────────────────────────────────────────────────────────────────┐
│                        TEST CASES                                  │
├─────────────────────┬─────────────────────┬──────────┬─────────────┤
│ Input A             │ Input B             │ Expected │ Description │
├─────────────────────┼─────────────────────┼──────────┼─────────────┤
│ "listen"            │ "silent"            │ true     │ Basic       │
│ "Listen"            │ "SILENT"            │ true     │ Case test   │
│ "Astronomer"        │ "Moon starer"       │ true     │ Phrase test │
│ "hello"             │ "world"             │ false    │ Not anagram │
│ "abc"               │ "abcd"              │ false    │ Diff length │
│ ""                  │ ""                  │ false    │ Empty       │
│ "a1b2c3"            │ "cba"               │ true     │ Numbers     │
│ "race car"          │ "carrace"           │ true     │ Spaces      │
│ null                │ "test"              │ false    │ Null check  │
└─────────────────────┴─────────────────────┴──────────┴─────────────┘
```

---

## 🚀 How to Run

```bash
# Compile
javac Question1.java

# Run
java Question1

# Example Interaction:
# Enter first word
# listen
# Enter second word
# silent
# is anagram
```

---

## 📝 Key Code Snippets Explained

### 1. Character to Index Conversion
```java
// 'a' = 97, 'b' = 98, ..., 'z' = 122 (ASCII values)
char ch = 'c';           // ASCII 99
int index = ch - 'a';    // 99 - 97 = 2  →  Index 2 = 'c'
```

### 2. Normalization (One-Liner)
```java
String normalized = input.toLowerCase().replaceAll("\\s+", "");
//                    │              │
//                    ▼              ▼
//              "Hello World"  "helloworld"
```

### 3. Ternary Operator (Compact if-else)
```java
System.out.println(ret ? "is anagram" : "not an anagram");
//         │              │                 │
//         ▼              ▼                 ▼
//      condition    if true           if false
```

---

## 🎓 Learning Points

```
┌────────────────────────────────────────────────────────────────┐
│  WHAT THIS TEACHES:                                            │
├────────────────────────────────────────────────────────────────┤
│  ✓ Character manipulation (char to int conversion)             │
│  ✓ Array-based frequency counting                              │
│  ✓ String normalization techniques                             │
│  ✓ Early exit optimization                                     │
│  ✓ Input validation best practices                             │
│  ✓ Resource management (Scanner.close())                       │
│  ✓ Ternary operator usage                                      │
│  ✓ Regex for whitespace removal (\\s+)                         │
│  ✓ O(n) algorithm design                                       │
└────────────────────────────────────────────────────────────────┘
```

---

## 🔮 Possible Extensions

```
┌────────────────────────────────────────────────────────────────┐
│  FUTURE ENHANCEMENTS:                                          │
├────────────────────────────────────────────────────────────────┤
│  • Unicode support (beyond a-z)                                │
│  • Multiple word anagram detection                             │
│  • Find all anagrams in a dictionary                           │
│  • GUI version with Swing/JavaFX                               │
│  • Unit tests with JUnit                                       │
│  • Performance benchmarking                                    │
└────────────────────────────────────────────────────────────────┘
```

---

*Generated for Question1.java - Anagram Checker with Full Visual Documentation*