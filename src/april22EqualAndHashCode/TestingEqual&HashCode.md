1. Question:
What happens if you override hashCode() but not equals() in a Java class, and then use it as a key in a HashMap with put()?

-- If you override hashCode() but not equals(), you break the general contract between the two, and HashMap behavior
   becomes inconsistent.

Specifically:
-- put() will store the value using your custom hash.
-- But get() or containsKey() may not find it, because equals() still uses default Object.equals() (which compares references).

## Why?
HashMap Lookup Logic:
-- It calls .hashCode() to find the bucket.
-- Then it uses .equals() to find the exact key in that bucket.
-- If you override hashCode() but not equals(), two logically "equal" objects may:
-- End up in the same bucket, but
-- Fail equality check, because the default equals() checks reference equality.

## Conclusion:
-- If you override hashCode(), you MUST also override equals(), and they must agree:
-- If a.equals(b) is true, then a.hashCode() == b.hashCode() must also be true.

2. if we override equal() and don't hashcode() method then how put() will behave

🔥 TL;DR:
If you override equals() but not hashCode(), your HashMap keys can become broken, leading to:
Keys that are "equal" according to equals(), but
Land in different buckets because their hashCode() values differ (default Object.hashCode() is identity-based).

This results in:
-- put() storing multiple "equal" keys
-- get() or containsKey() potentially returning null even when an "equal" key exists

⚠️ Why this happens:
p1.equals(p2) is true
But p1.hashCode() != p2.hashCode() because both still use Object.hashCode() (which is based on memory address)
So HashMap puts them in different buckets, and can't find the key when using p2.

✅ Best Practice:
If you override equals(), you must also override hashCode() so that equal objects have the same hash code.
