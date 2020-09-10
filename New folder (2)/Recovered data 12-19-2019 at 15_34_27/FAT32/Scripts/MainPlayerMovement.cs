using UnityEngine;

public class MainPlayerMovement : MonoBehaviour
{
    public CharacterController controller;

    public Rigidbody rb;
    public float distance = 5f;
    public static float fowardForce = 5f;
    public static float sidewaysForce = 2f;
    public float rotation = 190f;
    public static Animator anim;



    void Start()
    {
        anim = GetComponent<Animator>();    
    }


    void FixedUpdate()
    {
        if (Input.GetKeyDown(KeyCode.UpArrow)) { anim.SetBool("Run", true); }
        if (Input.GetKeyUp(KeyCode.UpArrow)) { anim.SetBool("Run", false); }
        if (Input.GetKey(KeyCode.UpArrow)) { transform.position += transform.forward * Time.deltaTime * fowardForce; }
       // if (Input.GetKey(KeyCode.DownArrow)) { transform.position += transform.forward * Time.deltaTime * -fowardForce; }
        if (Input.GetKey(KeyCode.LeftArrow)) { transform.Rotate(0, -rotation * Time.deltaTime, 0); }
        if (Input.GetKey(KeyCode.RightArrow)) { transform.Rotate(0, rotation * Time.deltaTime, 0); }
    }
}






