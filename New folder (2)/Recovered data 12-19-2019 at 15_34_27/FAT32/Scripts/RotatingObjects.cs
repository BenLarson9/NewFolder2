using UnityEngine;

public class RotatingObjects : MonoBehaviour
{
    public float Autotate = 200f;
   

  
    void Update()
    {
        transform.Rotate(0, Autotate * Time.deltaTime, 0);
    }
}
