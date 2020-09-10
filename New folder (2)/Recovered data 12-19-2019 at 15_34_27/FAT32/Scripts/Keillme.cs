using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class Keillme : MonoBehaviour
{

    public Image Heart1;
    public Collider Collider;
    public Transform player;
    Rigidbody rb;



    public void OnCollisionEnter(Collision col)
    {
        if (col.collider.gameObject.tag == "Enemy")
            {
                player.gameObject.GetComponent<MainPlayerMovement>().enabled = false;
              
                Destroy(Heart1);

         
                Application.LoadLevel(3);
            Coin.StartingScore = 0;
            


        }


        

       }
}